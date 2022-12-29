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
public class IOU {
    private HashMap<String, Double> iou;
    
    public IOU(){
        iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        iou.put(toWhom, amount);
        
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return iou.getOrDefault(toWhom, Double.valueOf(0));
        
    }
    
    
    
    


}














