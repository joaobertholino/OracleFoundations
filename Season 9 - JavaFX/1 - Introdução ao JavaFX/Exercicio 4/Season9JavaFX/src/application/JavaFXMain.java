package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

  @Override
  public void start(Stage primaryStage) {
    Button btnOne = new Button();
    Button btnTwo = new Button();
    
    btnOne.setText("Clique aqui! Button One");
    btnOne.setOnAction((ActionEvent event) -> {
      System.out.println("Texto imprimido com um clique no botão um!");
    });
    
    btnTwo.setText("Clique aqui! Button Two");
    btnTwo.setOnAction((ActionEvent event) -> {
      System.out.println("Texto imprimido com um clique no botão dois!");
    });
    
    Group myRoot = new Group();
    HBox panel = new HBox();
    myRoot.getChildren().add(panel);
    
    panel.getChildren().add(btnOne);
    panel.getChildren().add(btnTwo);
    panel.setLayoutY(150);
    
    Scene scene = new Scene(myRoot, 600, 500);

    primaryStage.setTitle("JavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
