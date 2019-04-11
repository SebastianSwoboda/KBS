package helper;

import javafx.scene.control.Alert;
import javafx.stage.Window;

public class AlertHelper {

    public Alert createAlert(Alert.AlertType alertType, String alertTitle, String alertText, Window owner){
        Alert alert = new Alert(alertType);
        alert.setTitle(alertTitle);
        alert.setHeaderText(null);
        alert.setContentText(alertText);
        alert.initOwner(owner);
        alert.show();
        return alert;
    }
}
