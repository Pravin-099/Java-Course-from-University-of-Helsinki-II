/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author dell
 */
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class SaveableDictionary {
    private HashMap<String,String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        dictionary = new HashMap<>();
        this.file = file;
    }
    
    public void add(String words, String translation){
        
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
        return dictionary.get(word);
    }
    
    public void delete(String word){
        dictionary.remove(dictionary.get(word));
        dictionary.remove(word);
    }
    
    public boolean load(){
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String parts[] = fileReader.nextLine().split(":");
                add(parts[0],parts[1]);
            }
            return true;
        }
        
        catch(Exception e){
            return false;
        }
        
        
    }
    
    public boolean save(){
        try{
            PrintWriter write = new PrintWriter(file);
            HashMap<String, String> oneWayDict = new HashMap<>();

            for(String words: dictionary.keySet()){
                if(oneWayDict.get(dictionary.get(words)) == null){
                    oneWayDict.put(words, dictionary.get(words));
                }

            }

            for(String words: oneWayDict.keySet()){
                write.println(words+":"+dictionary.get(words));
            }
            write.close();
            return true;
        }
        
        catch(Exception e){
            return false;
        }
        
    }
    
}
