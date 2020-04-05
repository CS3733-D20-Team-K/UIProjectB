package edu.wpi.khakikappas.views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RyanController {

  @FXML private Button homeButton;

  @FXML
  private void returnHome(ActionEvent actionEvent) throws IOException {
    Stage stage = (Stage) homeButton.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
  }
}
