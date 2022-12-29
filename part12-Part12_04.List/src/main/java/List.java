/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class List <Type>{
    private Type[] values;
    private int firstFreeIndex;
    
    public List(){
        values = (Type[]) new Object[10];
    }
    
    public void add(Type value){
        if(firstFreeIndex == values.length){
            grow();
        }
        values[firstFreeIndex] = value;
        firstFreeIndex++;
    }
    
    private void grow(){
        int newSize = values.length+values.length/2;
        Type[] newValues = (Type[]) new Object[newSize];
        for(int i=0; i<firstFreeIndex;i++){
            newValues[i] = values[i];
        }
        values = newValues;
    }
    
    public boolean contains(Type value){
        return indexOfValue(value) >= 0;
    }
    
    public int indexOfValue(Type value){
        for(int i=0; i<firstFreeIndex; i++){
            if(values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    
    public void moveToTheLeft(int fromIndex){
        for(int i=fromIndex; i< firstFreeIndex; i++){
            values[i] = values[i+1];
        }
    }
    
    public void remove(Type value){
        int fromIndex = indexOfValue(value);
        if(fromIndex < 0){
            return;
        }
        moveToTheLeft(fromIndex);
        firstFreeIndex--;
    }
    
    public Type value(int index){
        if(index < 0 || index > values.length){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        
        return values[index];
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
    
    
    
}
