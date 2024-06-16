package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();
    Rectangle rectangle = new Rectangle(50, 50, 100, 200);
    rectangle.setFill(Color.GREEN);
    rectangle.setStroke(Color.WHITESMOKE);
    rectangle.setStrokeWidth(5.0);
    
    root.getChildren().add(rectangle);
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
