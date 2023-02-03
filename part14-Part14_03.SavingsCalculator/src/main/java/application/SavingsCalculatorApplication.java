package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application{

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
    
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        
        layout.setCenter(lineChart);
        
        VBox vb = new VBox();
        
        BorderPane bp1 = new BorderPane();
        BorderPane bp2 = new BorderPane();
        
        Label saving = new Label("Monthly savings");
        
        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series savingsWithInterestSeries = new XYChart.Series();
        
        bp1.setLeft(saving);
        
        Slider s1 = new Slider();
        s1.setMin(25);
        s1.setMax(250);
        s1.setShowTickLabels(true);
        s1.setShowTickMarks(true);
        
        Label text = new Label(String.valueOf(s1.getValue()));
        
        Slider s2 = new Slider();
        s2.setMin(0);
        s2.setMax(10);
        s2.setShowTickLabels(true);
        s2.setShowTickMarks(true);
        
        s1.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            int savings = newvalue.intValue();
            text.setText("" + savings);

            savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 0; i < 30; i++) {
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            

            savs += s1.getValue() * 12;
            
        }
        });
        
        bp1.setCenter(s1);
        
        
        
        
        bp1.setRight(text);
        
        Label interest = new Label("Yearly interest rate");
        
        bp2.setLeft(interest);
        
        
        
        bp2.setCenter(s2);
        
        Label text2 = new Label(String.valueOf(s2.getMajorTickUnit()));
        s2.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            text2.setText("" + newvalue);

        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 0; i < 30; i++) {
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            savingsWithInterestSeries.getData().add(new XYChart.Data(i, intrs));

            savs += s1.getValue() * 12;
            intrs = (intrs + s1.getValue() * 12) * (1.0 + s2.getValue() / 100.0);
        }
        });
        
        bp2.setRight(text2);
        
        
        vb.getChildren().add(bp1);
        vb.getChildren().add(bp2);
        
        lineChart.getData().add(savingsSeries);
        lineChart.getData().add(savingsWithInterestSeries);
        
        layout.setTop(vb);
        

        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
        
        
        
        
        
        
    }
    

}
