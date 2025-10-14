package io.github.magwas.testfx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldButton extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the button with initial text
        Button button = new Button("Press me");
        
        // Set action for when the button is pressed
        button.setOnAction(e -> button.setText("Hello World"));
        
        // Create layout and add button
        StackPane root = new StackPane();
        root.getChildren().add(button);
        
        // Create scene and setup stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Hello World Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}