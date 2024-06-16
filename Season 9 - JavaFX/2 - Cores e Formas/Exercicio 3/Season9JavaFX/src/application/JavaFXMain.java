package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();

    LinearGradient gradient1 = new LinearGradient(0, 0, 1, 0, true,
            CycleMethod.NO_CYCLE, new Stop[]{
              new Stop(0, Color.DODGERBLUE),
              new Stop(1, Color.BLACK)
            });

    Rectangle rect1 = new Rectangle(0, 0, 80, 80);
    rect1.setFill(gradient1);

    rect1.setStroke(Color.WHITESMOKE);
    rect1.setStrokeWidth(5.0);

    root.getChildren().add(rect1);
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
