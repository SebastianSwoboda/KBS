package controller;

import factory.CreateStageFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;


public class MovieController {

    Stage stage;
    CreateStageFactory createStageFactory = new CreateStageFactory();




    @FXML
    private void handleImageViewAction() {
        try {
            createStageFactory.createMovieDetailsStage(stage);
        } catch (IOException e) {

        }

    }

    @FXML
    private void handleLogoutButtonEvent(ActionEvent actionEvent) {
        try {
            createStageFactory.createLoginStage(stage);
        } catch (IOException e) {

        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
