package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
    
    
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        HBox menu = new HBox();
        menu.setSpacing(10);
        menu.setPadding(new Insets(20,20,20,20));
        
        menu.getChildren().add(joke);
        menu.getChildren().add(answer);
        menu.getChildren().add(explanation);
        
        layout.setTop(menu);
        
        StackPane jokeText = createView("What do you call a bear with no teeth?");
        StackPane answerText = createView("A gummy bear.");
        StackPane explanationText = createView("");
        
        Scene scene = new Scene(layout);
        layout.setCenter(jokeText);
        
        joke.setOnAction(event -> layout.setCenter(jokeText));
        answer.setOnAction(event -> layout.setCenter(answerText));
        explanation.setOnAction(event -> layout.setCenter(explanationText));
        
        stage.setScene(scene);
        stage.show();
        
    }
    
    public StackPane createView(String text){
        StackPane layout = new StackPane(new Label(text));
        layout.setAlignment(Pos.CENTER);
        layout.setPrefSize(300, 180);
            
        return layout;
            
    }
    
    
}
