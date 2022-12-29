/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.ArrayList;
public class ChangeHistory {
    
    private ArrayList<Double> status;
    
    public ChangeHistory(){
        this.status = new ArrayList<>();
    }
    
    public void add(double status){
        this.status.add(status);
    }
    
    public void clear(){
        this.status.clear();
    }
    
    public String toString(){
        String string = "[";
        for(int i=0;i<this.status.size();i++){
            if(i != this.status.size()-1){
                string = string+this.status.get(i)+", ";
            }
            else{
                string = string+this.status.get(i);
            }
        }
        
        string = string+"]";
        
        return string;
    }
    
    
    public double maxValue(){
        if(this.status.isEmpty()){
            return 0.0;
        }
        Double largest = this.status.get(0);
        for(Double lar: this.status){
            if(largest < lar){
                largest = lar;
            }
        }
        
        return largest;
        
    }
    
    public double minValue(){
        if(this.status.isEmpty()){
            return 0.0;
        }
        Double smallest = this.status.get(0);
        for(Double small: this.status){
            if(smallest > small){
                smallest = small;
            }
        }
        
        return smallest;
    }
    
    public double average(){
        if(this.status.isEmpty()){
            return 0.0;
        }
        Double total = 0.0;
        for(Double contain: this.status){
            total = total+contain;
        }
        return total/this.status.size();
    }
}
