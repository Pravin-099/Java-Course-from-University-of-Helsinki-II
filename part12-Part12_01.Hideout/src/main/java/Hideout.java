/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Hideout <T>{
    private T hide;
    
    public Hideout(){
        hide = null;
    }
    
    public void putIntoHideout(T toHide){
        hide = toHide;
    }
    
    public T takeFromHideout(){
        if(hide == null){
            return null;
        }
        T hiding = hide;
        hide = null;
        return hiding;
    }
    
    public boolean isInHideout(){
        if(hide == null){
            return false;
        }
        
        return true;
    }
}
