package controller;

import dao.RegisterDao;
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
        try{
        AlertHelper alertHelper = new AlertHelper();
        Window owner = registerButton.getScene().getWindow();

        if (emailField.getText().isEmpty() || usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            alertHelper.createAlert(Alert.AlertType.ERROR, "Registration Unsuccessful!", "Empty Fields!", owner);

        } else {
            RegisterDao registerDao = new RegisterDao();
            registerDao.addUserToDb(usernameField.getText(), passwordField.getText(), emailField.getText());
            alertHelper.createAlert(Alert.AlertType.INFORMATION, "Registration Successful!",
                    "Welcome " + usernameField.getText(), owner).setOnCloseRequest(this::onRegisterConfirmEventHandler);

        }}catch (Exception e){
            e.printStackTrace();

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
