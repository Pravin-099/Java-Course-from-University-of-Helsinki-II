/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Organism implements Movable{
    private int dx;
    private int dy;
    
    public Organism(int x, int y){
        this.dx = x;
        this.dy = y;
    }
    
    public String toString(){
        return "x: "+dx+"; y: "+dy;
    }
    
    public void move(int dx, int dy){
        this.dx = this.dx+dx;
        this.dy = this.dy+dy;
    }
}
