package edu.wpi.khakikappas.views;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeController {
  @FXML private Label actionField;
  @FXML private Button AJRedirect, JeffRedirect, MattRedirect;

  @FXML
  private void doNothing(ActionEvent actionEvent) {
    actionField.setText("That Button does nothing");
  }

  @FXML
  private void switchToAJ(ActionEvent actionEvent) throws IOException {
    Stage stage = (Stage) AJRedirect.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("AJ.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
  }

  @FXML
  private void switchToMatt(ActionEvent actionEvent) throws IOException {
    Stage stage = (Stage) MattRedirect.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("Matt.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
  }

  @FXML
  public void switchToJeff(ActionEvent actionEvent) throws IOException {
    Stage stage = (Stage) JeffRedirect.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("Jeff.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
  }
}
