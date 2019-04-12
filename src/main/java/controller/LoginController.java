package controller;

import dao.LoginDao;
import factory.CreateStageFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    CreateStageFactory createStage = new CreateStageFactory();
    private Stage stage;
    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextFlow registerTextFlow;

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        try {
            LoginDao loginDao = new LoginDao();
            if (loginDao.verifyLogin(usernameField.getText(), passwordField.getText())) {
                createStage.createMovieStage(stage);



            }
        } catch (Exception e) {

        }
    }

    @FXML
    private void handleRegisterHyperlink(ActionEvent event) {
        try {
            createStage.createRegisterStage(stage);
        } catch (IOException e) {

        }

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Hyperlink register = new Hyperlink("Don't have an account?");
        registerTextFlow.getChildren().add(register);
        register.setOnAction(this::handleRegisterHyperlink);
    }
}







