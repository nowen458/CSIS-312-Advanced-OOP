// StackTest.java
// Program that tests Stack.java
// CSIS 312-B01 LUO

public class StackTest {
    
    public static void main(String[] args) {
        
        System.out.println("Nathaniel Owen - Assignment 8\n");
        
        // instantiate stack
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        
        // push elements onto stack1
        stack1.push("The ");
        stack1.push("rain ");
        stack1.push("in ");
        stack1.push("Spain ");
        
        // push elements onto stack2
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        
        // print details for stack1
        stack1.printList();
        System.out.printf("%nThe size of the String stack is %s%n", stack1.size());
        System.out.printf("The String stack is empty (T/F): %s%n", stack1.isEmpty());
        System.out.print("Popping elements off the String stack: ");
        while(stack1.isEmpty()!=true) {
            System.out.print(stack1.pop());
        }
        System.out.printf("%nThe String stack is empty (T/F): %s", stack1.isEmpty());
        System.out.printf("%nThe size of the String stack is %s%n%n", stack1.size());
        
        // print details for stack2
        stack2.printList();
        System.out.printf("%nThe size of the Integer stack is %s%n", stack2.size());
        System.out.printf("The Integer stack is empty (T/F): %s%n", stack2.isEmpty());
        System.out.print("Popping elements off the Integer stack: ");
        while(stack2.isEmpty()!=true) {
            System.out.print(stack2.pop());
        }
        System.out.printf("%nThe Integer stack is empty (T/F): %s", stack2.isEmpty());
        System.out.printf("%nThe size of the Integer stack is %s%n%n", stack2.size());
        
        System.out.print(stack2.pop());
        
    } // end method main
    
} // end class StackTest
