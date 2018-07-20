// ListTest.java
// Program that prints out a LinkedList object and then prints it out in reverse
// CSIS 312-B01 LUO/*
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class ListTest {
    
    public static void main(String[] args)
            
    {
        
        System.out.println("Nathaniel Owen - Assignment 5-2\n");
        
        // create string array
        String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        // create lists
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        
        // add colors to first letter
        for (String character : characters)
            list1.add(character);
        for (String character : characters)
            list2.add(character);
        
        // print out first list
        System.out.printf("First List: \n");
        for (int i = 0; i < list1.size(); i ++)
            System.out.printf("%s ", list1.get(i));
        
        Collections.reverse(list1);
        
        Collections.copy(list2, list1);
        
        // print out second list
        System.out.printf("Second List: \n");
        for (int i = 0; i < list2.size(); i ++)
            System.out.printf("%s ", list2.get(i));
        
    }
    
} // end class ListTest
