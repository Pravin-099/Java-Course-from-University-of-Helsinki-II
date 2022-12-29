/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> items;
    
    public StorageFacility(){
            
        this.items = new HashMap<>();        
    }
    public void add(String unit, String item){
        this.items.putIfAbsent(unit, new ArrayList<>());
        this.items.get(unit).add(item);
    
    }
    
    public ArrayList<String> contents(String storageUnit){
        
        if(this.items.get(storageUnit)==null){
               
            return new ArrayList<>();
        } 
        
        return this.items.get(storageUnit);
    }
            
    public void remove(String storageUnit, String item){
        this.items.get(storageUnit).remove(item);
        if(this.items.get(storageUnit).isEmpty()){
            this.items.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){

        ArrayList<String> list = new ArrayList<>();
        
        for(String key: this.items.keySet()){
        
            if(this.items.get(key)!= null){
                list.add(key);
            
            }
        }
       
        return list;
    



    }


}