package logic;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SuccessController{

    @FXML
    public ListView listView;
    @FXML
    public Button closeBtn;

    public ArrayList<String> seats = new ArrayList<>();

    @FXML
    public void initialize() {

        Platform.runLater(() ->{
            for(String s : seats){
                listView.getItems().add(s);
            }
        });
    }

    public void Close() throws IOException {
        Stage stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/kbs_ui_movie.fxml"));

        Stage newStage = new Stage();

        Parent root = loader.load();
        MovieController movieController = loader.getController();

        Scene scene = new Scene(root);

        newStage.setScene(scene);
        newStage.setTitle("KBS Movie");
        newStage.show();
        
    }

    public void setSeats(ArrayList<String> seats) {
        this.seats = seats;
    }
}
