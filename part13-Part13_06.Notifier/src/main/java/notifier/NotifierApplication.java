package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
    
    public void start(Stage stage){
        TextField text = new TextField("hello world!");
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction(event -> label.setText(text.getText()));
        
        
        VBox layout = new VBox(text,button,label);
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        
        stage.show();
    }

}
