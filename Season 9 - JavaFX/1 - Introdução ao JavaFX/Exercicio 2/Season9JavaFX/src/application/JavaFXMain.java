package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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
    
    btnOne.setText("Clique aqui! Button Two");
    btnOne.setOnAction((ActionEvent event) -> {
      System.out.println("Texto imprimido com um clique no botão dois!");
    });

    StackPane root = new StackPane();
    root.getChildren().add(btnOne);
    root.getChildren().add(btnTwo);

    Scene scene = new Scene(root, 300, 250);

    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
