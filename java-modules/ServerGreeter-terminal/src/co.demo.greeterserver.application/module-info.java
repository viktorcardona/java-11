module co.demo.greeterserver.application {
    requires co.demo.greeterserver;

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    uses co.demo.greeterserver.GreeterServer;

    opens co.demo.greeterserver.application.controller
            to javafx.graphics,javafx.fxml;
}