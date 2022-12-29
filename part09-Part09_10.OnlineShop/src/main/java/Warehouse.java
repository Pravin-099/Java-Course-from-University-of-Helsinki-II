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
import java.util.Set;

public class Warehouse {
    private Map<String,Integer> products;
    private Map<String,Integer> balanceStock;
    
    public Warehouse(){
        products = new HashMap<>();
        balanceStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        balanceStock.put(product, stock);
    }
    
    public int price(String product){
        if(this.products.get(product)==null){
            return -99;
        }
        return this.products.get(product);
    }
    
    public int stock(String product){
        if(balanceStock.get(product)==null){
            return 0;
        }
        return balanceStock.get(product);
    }
    
    public boolean take(String product){
        if(balanceStock.get(product)==null){
            return false;
        }else if(balanceStock.get(product)>0){
            int balance = balanceStock.get(product)-1;
            balanceStock.put(product,balance);
            return true;
        }else{
            return false;
        }
        
    }
    
    public Set<String> products(){
        Set<String> product = products.keySet();
        return product;
    }
}
