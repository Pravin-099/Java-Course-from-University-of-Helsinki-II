/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    
    public int compare(Card c1, Card c2){
        if(c1.getSuit().ordinal() == c2.getSuit().ordinal()){
            if(c1.getValue() == c2.getValue()){
                return 0;
            }
        }
        
        if(c1.getSuit().ordinal() > c2.getSuit().ordinal()){
            if(c2.getValue() > c1.getValue()){
                return 1;
            }
        }
        
        if(c1.getSuit().ordinal() > c2.getSuit().ordinal()){
            if(c1.getValue() > c2.getValue()){
                return 1;
            }
        }
        
        if(c1.getSuit().ordinal() == c2.getSuit().ordinal()){
            if(c1.getValue() > c2.getValue()){
                return 1;
            }
        }
        
        return -1;
    }
}
