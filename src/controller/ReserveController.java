package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

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
