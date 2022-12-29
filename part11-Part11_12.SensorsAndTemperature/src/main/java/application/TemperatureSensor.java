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
import java.util.Random;
public class TemperatureSensor implements Sensor{
    private int read;
    private boolean sensor = false;
    
    public TemperatureSensor(){
        this.read = 0;
    }
    
    public boolean isOn(){
        return sensor;
    }
    
    public void setOn(){
        sensor = true;
    }
    
    public void setOff(){
        sensor = false;
    }
    
    public int read(){
        int number = new Random().nextInt(61)-31;
        if(number == -31){
            number = -30;
        }
        if(sensor == true){
            return number;
        }
        throw new IllegalStateException();
    }
}
