package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
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

    Group root = new Group();
    root.getChildren().add(btnOne);
    root.getChildren().add(btnTwo);
    
    btnOne.setLayoutY(150);

    Scene scene = new Scene(root, 300, 250);

    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
