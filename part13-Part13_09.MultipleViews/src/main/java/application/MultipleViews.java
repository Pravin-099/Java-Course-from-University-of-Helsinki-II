package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
    
    public void start(Stage stage){
        Label text1 = new Label("First view!");
        BorderPane bp = new BorderPane();
        bp.setTop(text1);
        
        Button button1 = new Button("To the second view!");
        bp.setCenter(button1);
        Scene scene1 = new Scene(bp);
        stage.setScene(scene1);
        
        button1.setOnAction(event-> {
            
            VBox vb = new VBox();
            Button button2 = new Button("To the third view!");
            vb.getChildren().add(button2);
            Label text2 = new Label("Second view!");
            vb.getChildren().add(text2);
            Scene scene2 = new Scene(vb);
            stage.setScene(scene2);
            button2.setOnAction(event2-> {
                GridPane gp = new GridPane();
                Label text3 = new Label("Third view!");
                gp.add(text3, 0, 0);
                Button button3 = new Button("To the first view!");
                gp.add(button3, 1, 1);
                Scene scene3 = new Scene(gp);
                stage.setScene(scene3);
                button3.setOnAction(event3 -> {
                    stage.setScene(scene1);
                });
                
            });
            
            
        });
                
        stage.show();
    }
    
    
    

}
