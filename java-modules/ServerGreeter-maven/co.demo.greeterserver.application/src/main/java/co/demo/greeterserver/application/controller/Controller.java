package co.demo.greeterserver.application.controller;

import co.demo.greeterserver.GreeterServer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class Controller {

    @FXML
    private TextArea greetTextArea;

    @FXML
    private HBox buttonsArea;

    @FXML
    private void initialize() {
        System.out.println("application -> Initializing the JavaFX Greeter Server Controller...");
        buttonsArea.setSpacing(10);
        buttonsArea.getChildren().addAll(buildButtons());
    }

    private List<Button> buildButtons() {
        List<Button> buttons = ServiceLoader.load(GreeterServer.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .map(server2Button())
                .collect(toList());
        buttons.add(buildButton("Clear", a -> greetTextArea.clear()));
        return buttons;
    }

    private Function<GreeterServer, Button> server2Button() {
        return server -> buildButton(server.language(), a -> greetTextArea.setText(server.getGreet()));
    }

    private Button buildButton(String label, EventHandler<ActionEvent> handler) {
        Button button = new Button(label);
        button.setOnAction(handler);
        return button;
    }

}
