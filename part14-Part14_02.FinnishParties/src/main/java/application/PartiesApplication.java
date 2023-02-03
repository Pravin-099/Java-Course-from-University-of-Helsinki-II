package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{
    HashMap<String, HashMap<Integer,Double>> values ;
    
    public PartiesApplication(){
        values= new HashMap<>();
    }
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    public void start(Stage stage){
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");
        
        
        try(Scanner scan = new Scanner(Paths.get("partiesdata.tsv"))){
            ArrayList<Integer> yearList = new ArrayList<>();
            
            
            String[] years = scan.nextLine().split("\t");
            
            for(int i=1;i<years.length;i++){
                yearList.add(Integer.parseInt(years[i]));
            }
            
            while(scan.hasNextLine()){
                String[] parts = scan.nextLine().split("\t");
                String party = parts[0];
                HashMap<Integer,Double> data = new HashMap<>();
                for(int i=1;i<parts.length;i++){
                    if (!parts[i].equals("-")) {
                        data.put(yearList.get(i-1),Double.parseDouble(parts[i]));
                    }
                    
                }
                
                values.put(party, data);

            }
        }
        catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
        
        values.keySet().stream().forEach(party-> {
            
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            
            values.get(party).entrySet().stream().forEach(value -> {
                
                data.getData().add(new XYChart.Data(value.getKey(),value.getValue()));
                
            });
            
            lineChart.getData().add(data);
            
            
            
        });
        
        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();
        
        
    }

}
