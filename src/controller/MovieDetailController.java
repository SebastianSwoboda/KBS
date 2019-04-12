package controller;

import factory.CreateStageFactory;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class MovieDetailController {

    CreateStageFactory createStageFactory = new CreateStageFactory();
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void handleOnBackButtonEvent(ActionEvent event) {
        try {
            createStageFactory.createMovieStage(stage);
        } catch (IOException e) {

        }
    }

}
