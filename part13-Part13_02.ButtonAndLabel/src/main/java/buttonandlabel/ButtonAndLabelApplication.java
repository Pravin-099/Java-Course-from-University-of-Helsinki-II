package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
    
    @Override
    public void start(Stage stage){
        
        Button button = new Button();
        Label label = new Label("Hello");
        
        Group group = new Group();
        group.getChildren().add(button);
        group.getChildren().add(label);
        
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.show();
        
    }

}
