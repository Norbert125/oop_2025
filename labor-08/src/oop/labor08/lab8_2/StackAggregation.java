package oop.labor08.lab8_2;

import java.util.ArrayList;
import java.util.Objects;

public class StackAggregation {
    private final int capacity;
    private ArrayList<Object> items;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>(capacity);
    }

    public boolean isFull(){
        return this.capacity == items.size();
    }

    public void push(Object object){
        if(isFull()) {
            System.out.println("Stack is full!"); return;
        }
        items.add(object);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }


    public Object top(){
        if(isEmpty()){
            System.out.println("Stack is empty!"); return null;
        }
        return items.getLast();
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty"); return;
        }
        items.removeLast();
    }

}
