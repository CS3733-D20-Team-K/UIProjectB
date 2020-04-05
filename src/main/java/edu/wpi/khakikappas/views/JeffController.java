package edu.wpi.khakikappas.views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JeffController {

  @FXML private Button homeButton;
  @FXML private CheckBox checkbox;
  @FXML private Label congrats;

  @FXML
  private void returnHome(ActionEvent actionEvent) throws IOException {
    Stage stage = (Stage) homeButton.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
  }

  public void congrat(ActionEvent actionEvent) {
    if (checkbox.isSelected()) {
      congrats.setVisible(true);
    } else congrats.setVisible(false);
  }
}
