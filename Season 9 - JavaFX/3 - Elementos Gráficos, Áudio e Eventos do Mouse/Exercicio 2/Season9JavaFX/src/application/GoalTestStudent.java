package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.entities.GoalStudent;

public class GoalTestStudent extends Application {
    private static Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root, 600, 500, Color.rgb(50,50,50));
        
        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        root.getChildren().add(new GoalStudent());
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
