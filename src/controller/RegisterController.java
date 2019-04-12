package controller;

import factory.CreateStageFactory;
import helper.AlertHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class RegisterController {

    private Stage stage;


    @FXML
    private TextField emailField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button registerButton;

    @FXML
    private void onRegisterEventHandler(ActionEvent event) {
        AlertHelper alertHelper = new AlertHelper();
        Window owner = registerButton.getScene().getWindow();

        if (emailField.getText().isEmpty() || usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            alertHelper.createAlert(Alert.AlertType.ERROR, "Registration Unsuccessful!", "Empty Fields!", owner);

        } else {
            alertHelper.createAlert(Alert.AlertType.INFORMATION, "Registration Successful!",
                    "Welcome " + usernameField.getText(), owner).setOnCloseRequest(this::onRegisterConfirmEventHandler);

        }


    }

    @FXML
    public void onRegisterConfirmEventHandler(DialogEvent event) {
        try {
            CreateStageFactory createStageFactory = new CreateStageFactory();
            createStageFactory.createLoginStage(stage);
        } catch (IOException e) {

        }

    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }


}
