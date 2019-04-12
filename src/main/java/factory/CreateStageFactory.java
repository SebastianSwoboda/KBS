package factory;

import controller.LoginController;
import controller.MovieController;
import controller.MovieDetailController;
import controller.RegisterController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateStageFactory {

    public void createLoginStage(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/kbs_ui_login.fxml"));
        Parent root = loader.load();
        LoginController loginController = loader.getController();
        loginController.setStage(stage);
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }


    public MovieController createMovieStage(Stage stage)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/kbs_ui_movie.fxml"));
        Parent root = loader.load();
        MovieController movieController = loader.getController();
        movieController.setStage(stage);
        stage.setTitle("Movies");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
        return loader.getController();
    }

    public MovieDetailController createMovieDetailsStage(Stage stage)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/kbs_ui_moviedetails.fxml"));
        Parent root = loader.load();
        MovieDetailController movieDetailController = loader.getController();
        movieDetailController.setStage(stage);
        stage.setTitle("Details");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
        return loader.getController();
    }

    public void createRegisterStage(Stage stage)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/kbs_ui_register.fxml"));
        Parent root = loader.load();
        RegisterController registerController = loader.getController();
        registerController.setStage(stage);
        stage.setTitle("Register");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();

    }




}




