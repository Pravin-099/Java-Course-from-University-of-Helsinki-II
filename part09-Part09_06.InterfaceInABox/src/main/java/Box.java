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

public class Box implements Packable{
    private ArrayList<Packable> items;
    private double capacity;
    
    public Box(double capacity){
        items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Packable items){
        
        if((weight()+items.weight()) <= capacity){
            this.items.add(items);
        }
    }
    
    public String toString(){
        return "Box: "+items.size()+" items, total weight "+weight()+" kg";
    }
    
    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for(Packable weights: this.items){
            weight = weight+weights.weight();
        }
        return weight;
    }
}
