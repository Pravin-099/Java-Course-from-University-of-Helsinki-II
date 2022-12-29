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

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> box;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity){
        this.box = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Item item){
        int maxWeight = 0;
        for (Item items : box) {
            maxWeight = maxWeight+items.getWeight();
        }
        if((maxWeight+item.getWeight())<= capacity){
            box.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        if(box.contains(item)){
            return true;
        }
        return false;
    }
}
