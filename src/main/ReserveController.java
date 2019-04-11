package logic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class ReserveController {

    @FXML
    private AnchorPane content;
    @FXML
    private Button btn;

    private ArrayList<String> seats = new ArrayList<>();

    public void AddToList(MouseEvent mouseEvent) {

        String style = mouseEvent.getPickResult().getIntersectedNode().getStyle();
        String seat = mouseEvent.getPickResult().getIntersectedNode().getId();

        if (!Objects.equals(style, "-fx-fill: Red;")) {
            mouseEvent.getPickResult().getIntersectedNode().setStyle("-fx-fill: Red;");
            seats.add(seat);

        } else {
            mouseEvent.getPickResult().getIntersectedNode().setStyle("-fx-fill: DODGERBLUE;");
            seats.remove(seat);
        }
    }

    public void SendData() throws Exception {
        //To Do: Add SQL Query

        for (String s : seats) {
            System.out.println(s);
        }

        Stage currentStage = (Stage) btn.getScene().getWindow();
        currentStage.close();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/kbs_ui_success.fxml"));

        Stage stage = new Stage();

        Parent root = loader.load();
        SuccessController successController = loader.getController();
        successController.setSeats(seats);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Success!");
        stage.show();
    }

}
