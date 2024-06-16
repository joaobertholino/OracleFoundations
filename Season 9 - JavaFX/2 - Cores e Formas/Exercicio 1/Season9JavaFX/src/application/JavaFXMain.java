package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();
    
    root.setLayoutY(150);
    
    Scene scene = new Scene(root, 600, 500, Color.BLACK);

    primaryStage.setTitle("JavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
