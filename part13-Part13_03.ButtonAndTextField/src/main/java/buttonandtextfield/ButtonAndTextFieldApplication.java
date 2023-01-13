package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        Application.launch(args);
    }
    
    public void start(Stage stage){
        TextField text = new TextField();
        Button button = new Button();
        
        Group group = new Group();
        group.getChildren().add(text);
        group.getChildren().add(button);
        
        Scene scene = new Scene(group);
        stage.setScene(scene);
        
        stage.show();
        
    }

}
