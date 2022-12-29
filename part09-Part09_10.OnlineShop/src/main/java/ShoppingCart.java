/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;
    
    
    public ShoppingCart(){
        items = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(items.get(product)==null){
            items.put(product, new Item(product,1,price));
        }else{
            items.get(product).increaseQuantity();
        }
        
        
    }
    
    public int price(){
        int totalPrice = 0;
        for(Item prices: items.values()){
            totalPrice = totalPrice+prices.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for(String key: items.keySet()){
            System.out.println(items.get(key).toString());
        }
    }
}
