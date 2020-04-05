package edu.wpi.khakikappas.views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MattController {

  @FXML private Button redirectHome;
  @FXML private CheckBox checkBox;
  @FXML private Circle circle;

  public void switchToHome(ActionEvent actionEvent) throws IOException {
    Stage stage = (Stage) redirectHome.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
  }

  public void showCircle(ActionEvent actionEvent) {
    if (checkBox.isSelected()) {
      circle.setVisible(true);
    } else circle.setVisible(false);
  }
}
