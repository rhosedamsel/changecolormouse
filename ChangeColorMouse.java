import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorMouse extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a circle
        Circle circle = new Circle(100, Color.WHITE);
        
        // Add event handlers to change the color
        circle.setOnMousePressed(event -> circle.setFill(Color.BLACK));
        circle.setOnMouseReleased(event -> circle.setFill(Color.WHITE));
        
        // Create a layout and add the circle to it
        StackPane root = new StackPane(circle);
        
        // Create a scene and add the layout to it
        Scene scene = new Scene(root, 200, 200);
        
        // Set the scene to the stage and show the stage
        primaryStage.setTitle("Change Color with Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
