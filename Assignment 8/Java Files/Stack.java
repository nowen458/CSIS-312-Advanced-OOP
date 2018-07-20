// Stack.java
// Program that uses a stack and generic methods to revers the inputs
// CSIS 312-B01 LUO
import java.util.ArrayList;

public class Stack<T> {
    
    private ArrayList<T> elements;
    
    // stack constructor
    public Stack() {
        elements = new ArrayList<>();
    }
    
    // method taht pushes element onto stack
    public void push(T push) {
        elements.add(push);
    }
    
    // method that pops off element in stack
    public T pop() {
        try {
            return elements.remove(elements.size()-1);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No more items can be popped" + e);
        }
        return null;
    }
    
    // method that returns size of stack
    public int size() {
        return elements.size();
    }
    
    // method that returns true of stack is empty
    public boolean isEmpty() {
        return (elements.size() == 0);
    }
    
    public void printList() {
        System.out.printf("Pushing onto String Stack: ");
        for (int i = 0; i < elements.size(); i ++)
            System.out.printf("%s ", elements.get(i));
    }
    
} // end class Stack
