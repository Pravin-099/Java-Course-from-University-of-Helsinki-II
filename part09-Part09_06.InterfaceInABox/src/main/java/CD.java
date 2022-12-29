/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class CD implements Packable{
    private String artist;
    private String name;
    private int year;
    private static final double weight = 0.1; 
    
    public CD(String artist,String name,int year){
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    
    public double weight(){
        return weight;
    }
    
    public String toString(){
        return artist+": "+name+" ("+year+")";
    }
}
