module com.example.dualgorithms {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires junit;
    requires java.compiler;
    requires org.jetbrains.annotations;

    opens com.main to javafx.fxml;
    exports com.main;
    exports com.main.tools;
    exports com.main.tests;
    opens com.main.tools to javafx.fxml;
}