/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Books implements Comparable<Books>{
    private String name;
    private int age;
    
    public Books(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String toString(){
        return name+ "(recommended for "+age+" year-olds or older)";
    }
    
    public int compareTo(Books compare){
        return this.age - compare.getAge();
    }
    
    
    
    
}
