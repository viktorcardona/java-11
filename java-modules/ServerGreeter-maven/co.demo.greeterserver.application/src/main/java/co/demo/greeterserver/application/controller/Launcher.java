package co.demo.greeterserver.application.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void launchApplication(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/GreeterGUI.fxml"));
        primaryStage.setTitle("Greeter");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }

}
