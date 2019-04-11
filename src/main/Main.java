package logic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        CreateStageFactory createStage = new CreateStageFactory();
        Stage stage = new Stage();
        createStage.createLoginStage(stage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
