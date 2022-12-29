/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author dell
 */
import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> readings = new ArrayList<>();
    
    public AverageSensor(){
        sensors = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        
        sensors.add(toAdd);
    }
    
    public boolean isOn(){
        int count = 0;
        for(Sensor s: sensors){
            if(s.isOn()==true){
                count++;
            }
        }
        if(count == sensors.size()){
            return true;
        }else{
            return false;
        }
        
    }
    
    public void setOn(){
        for(Sensor s: sensors){
            s.setOn();
        }
        
    }
    
    public void setOff(){
        for(Sensor s: sensors){
            s.setOff();
        }
        
    }
    
    public int read(){
        int count = 0;
        for(Sensor s: sensors){
            if(s.isOn()==true){
                count++;
            }
        }
        if(count != sensors.size() || sensors== null){
            throw new IllegalStateException();
        }
        int avg = 0;
        
        for(Sensor s: sensors){
            
            avg = avg+s.read();
            
        }
        readings.add(avg/sensors.size());
        return avg/sensors.size();
    }
    
    public List<Integer> readings(){

        return readings;
    }
}
