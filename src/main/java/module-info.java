module main.gui {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
                requires org.kordamp.bootstrapfx.core;
            
    opens main.gui to javafx.fxml;
    exports main.gui;
    exports controllers;

    exports math.equations;
    exports math.utils;

    opens controllers to javafx.fxml;

    opens math.utils to java.base;
    opens math.equations to java.base;
    opens math.groups to java.base;
    exports controllers.single;
    opens controllers.single to javafx.fxml;
    exports controllers.group;
    opens controllers.group to javafx.fxml;
}