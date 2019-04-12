package logic;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        factory.CreateStageFactory createStage = new factory.CreateStageFactory();
        Stage stage = new Stage();
        createStage.createLoginStage(stage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
