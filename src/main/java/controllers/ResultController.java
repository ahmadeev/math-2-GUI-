package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import utils.InputData;

import static main.gui.Main.*;
import static math.utils.Methods.Halving.halvingData;
import static math.utils.Methods.Newton.newtonData;
import static math.utils.Methods.Iteration.iterationData;

public abstract class ResultController {
    @FXML
    private void handleShowInfoButton() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("invocation info");
        alert.setHeaderText(null);

        String content =
                "programmeMode: " + data.getProgrammeMode() + "\n" +
                        "objectCode: " + data.getObjectCode() + "\n" +
                        "methodNumber: " + data.getMethodNumber() + "\n" +
                        "lowerBoundary: " + data.getLowerBoundary() + "\n" +
                        "higherBoundary: " + data.getHigherBoundary() + "\n" +
                        "precision: " + data.getPrecision() + "\n";

        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    private void handleExitButton() {
        System.exit(0);
    }

    @FXML
    private void handleNewButton() {
        data = new InputData();
        halvingData = FXCollections.observableArrayList();
        newtonData = FXCollections.observableArrayList();
        iterationData = FXCollections.observableArrayList();
        loadScene(primaryStage, "mode-select.fxml", "solving equations");
    }
}