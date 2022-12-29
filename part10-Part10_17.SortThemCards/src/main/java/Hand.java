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
import java.util.Iterator;
import java.util.Collections;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand(){
        hand = new ArrayList<>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        Iterator l = hand.iterator();
        
        while(l.hasNext()){
            System.out.println(l.next());
        }
    }
    
    public void sort(){
        hand = hand.stream().sorted().collect(Collectors.toCollection(ArrayList :: new));
    }
    
    public int compareTo(Hand compare){
        int thisSum = 0;
        int compareSum = 0;
        for(Card c: hand){
            thisSum = thisSum+c.getValue();
        }
        for(Card d: compare.hand){
            compareSum = compareSum + d.getValue();
        }
        
        if(thisSum == compareSum){
            return 0;
        }
        
        if(thisSum >compareSum){
            return 1;
        }else{
            return -1;
        }
        
    }
    
    public void sortBySuit(){
        
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
