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

public class VehicleRegistry {
    private HashMap<LicensePlate,String> ownerName;
    
    public VehicleRegistry(){
        this.ownerName = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(owner==null){
            return true;
        }
        if(this.ownerName.containsKey(licensePlate)){
            return false;
        }
        this.ownerName.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        if(this.ownerName.get(licensePlate)==null){
            return null;
        }
        
        return this.ownerName.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.ownerName.get(licensePlate)==null){
            return false;
        }
        
        this.ownerName.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate l: ownerName.keySet()){
            System.out.println(l);
        }
    }
    
    public void printOwners(){
        ArrayList<String> alreadyContains = new ArrayList<>();
        for(String name: ownerName.values()){
            
            if(! alreadyContains.contains(name)){
                System.out.println(name);
            }
            alreadyContains.add(name);
        }
    }
}
