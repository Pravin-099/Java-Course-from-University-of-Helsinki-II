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
import java.util.List;
import java.util.Iterator;

public class Employees {
    private List<Person> persons;
    
    public Employees(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        Iterator<Person> l = peopleToAdd.iterator();
        while(l.hasNext()){
            persons.add(l.next());
        }
    }
    
    public void print(){
        Iterator<Person> l = persons.iterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> l = persons.iterator();
        while(l.hasNext()){
            Person p = l.next();
            if(p.getEducation()==education){
                System.out.println(p);
            }
        }
       
    }
    
    public void fire(Education education){
        Iterator<Person> l = persons.iterator();
        
        while(l.hasNext()){
            Person p = l.next();
            if(p.getEducation()==education){
                l.remove();
            }
        }
        
    }
    
    
    
}
