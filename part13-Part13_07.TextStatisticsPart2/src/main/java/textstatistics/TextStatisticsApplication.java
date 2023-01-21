package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    public void start(Stage stage){
        
        TextArea texts = new TextArea();
        BorderPane layout = new BorderPane();
        layout.setCenter(texts);
        HBox h = new HBox();
        Label letters = new Label("Letters: 0");
        Label word = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");
        
        h.getChildren().add(letters);
        h.getChildren().add(word);
        h.getChildren().add(longestWord);
        
        
        layout.setBottom(h);
        
        texts.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        
        String[] parts = newValue.split(" ");
        int words = parts.length;
        String longest = Arrays.stream(parts)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();

    // set values of text elements
    
        letters.setText("Letters: "+characters);
        word.setText("Words: "+words);
        longestWord.setText("The longest word is: "+longest);
});
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

}
