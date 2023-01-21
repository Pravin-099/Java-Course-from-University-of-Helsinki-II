package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
    
    public void start(Stage stage){
        Label text = new Label("Enter your name and start");
        TextField name = new TextField();
        Button start = new Button("start");
        
        GridPane layout = new GridPane();
        
        layout.add(text, 0, 0);
        layout.add(name, 0, 1);
        layout.add(start, 0, 2);
        
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.setPrefSize(300, 180);
        
        Label welcomeText = new Label();
        
        Scene inputText = new Scene(layout);
        stage.setScene(inputText);
        
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene greetingText = new Scene(welcomeLayout);
        
        start.setOnAction((event)-> {
            welcomeText.setText("Welcome "+name.getText()+"!");
            stage.setScene(greetingText);
        });
        
        stage.show();
        
    }
}
