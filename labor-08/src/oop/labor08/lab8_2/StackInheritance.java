package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList {
    private final int capacity;
    public StackInheritance(int capacity){
        super(capacity);
        this.capacity = capacity;
    }
    public boolean isFull(){
        return capacity == this.size();
    }
    public boolean isEmpty() {
        return super.isEmpty();
    }
    public void push(Object object){
        if(isFull()){
            System.out.println("Stack is full"); return;
        }
        super.add(object);
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty"); return;
        }
        this.removeLast();
    }
    public Object top(){
        if(isEmpty()){
            System.out.println("Stack is empty!"); return null;
        }
        return this.getLast();
    }

}
