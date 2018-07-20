// PairTest.java
// Program that tests Pair.java
// CSIS 312-B01 LUO

public class PairTest {
    
    public static void main(String[] args) {
        
        System.out.println("Nathaniel Owen - Assignment 7\n");
        
        // create two types of Pair and set initial elements
        Pair p1 = new Pair(1, "String Test 1");
        Pair p2 = new Pair("String Test 2", 2);
        
        // print initial values via Get Methods
        System.out.printf("%n%s %n%s:%s%n%s: %s%n", "Original values of P1", "Integer", p1. getFirst(), "String", p1. getSecond());
        System.out.printf("%n%s %n%s:%s%n%s: %s%n", "Original values of P2", "String", p2. getFirst(), "Integer", p2. getSecond());
        
        // set values of p1 via Set Methods
        p1.setFirst(123456789);
        p1.setSecond("This string has been modified.");
        
        // set values of p2 via Set Methods
        p2.setFirst("This string has been modified as well.");
        p2.setSecond(987654321);
        
        // print edited values via Get Methods
        System.out.printf("%n%s %n%s:%s%n%s: %s%n", "Edited values of P1", "Integer", p1. getFirst(), "String", p1. getSecond());
        System.out.printf("%n%s %n%s:%s%n%s: %s%n", "Edited values of P2", "String", p2. getFirst(), "Integer", p2. getSecond());
        
    } // end method main
    
} // end class PairTest
