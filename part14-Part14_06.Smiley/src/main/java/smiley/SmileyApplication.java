package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
    
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        
        Canvas paintingCanvas = new Canvas(640,480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        painter.setFill(Color.BLACK);
        
        layout.setCenter(paintingCanvas);
        painter.fillRect(70, 60, 25, 25);
        painter.fillRect(200, 60, 25, 25);
        painter.fillRect(75, 200, 150, 25);
        painter.fillRect(75, 175, 25, 25);
        painter.fillRect(200, 175, 25, 25);
        
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        
        
    }

}
