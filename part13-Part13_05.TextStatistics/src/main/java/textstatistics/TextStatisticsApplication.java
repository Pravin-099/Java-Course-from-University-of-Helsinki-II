package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
 
public class TextStatisticsApplication extends Application{
 
 
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    public void start(Stage stage){
        
        TextArea texts = new TextArea("center");
        BorderPane layout = new BorderPane();
        layout.setCenter(texts);
        HBox h = new HBox();
        h.getChildren().add(new Label("Letters: 0"));
        h.getChildren().add(new Label("Words: 0"));
        h.getChildren().add(new Label("The longest word is:"));
        layout.setBottom(h);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
}