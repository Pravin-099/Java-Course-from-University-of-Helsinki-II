/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        herd = new ArrayList<>();
    }
    
    public String toString(){
        String members = "";
        for(Movable herds: herd){
            members = members+herds.toString()+"\n";
        }
        
        return members;
    }
    
    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable herds: herd){
            herds.move(dx, dy);
        }
    }
}
