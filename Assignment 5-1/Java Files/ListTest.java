// ListTest.java
// Program that generates 25 random integers and sorts them, calculates the sum and calculates the floating-point average
// CSIS 312-B01 LUO/*
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class ListTest {
    
    public static void main(String[] args)
            
    {
        
        System.out.println("Nathaniel Owen - Assignment 5-1\n");
        
        // create integer array
        int[] numbers = new int[25];
        
        // fill array with 25 random elements
        for (int i = 0; i < 25; i++)
        {
            Random rand = new Random();
            numbers[i] = rand.nextInt(100);
        }
        
        // create list
        List<Integer> list = new LinkedList<>();
        
        // add elements in numbers to list
        for (Integer number : numbers)
            list.add(number);
        
        // sort list
        Collections.sort(list);
        
        // add elements
        int total = 0;
        for (int i = 0; i < list.size(); i++)
        {
            total = numbers[i] + total;
        }
        
        // calculate average
        double average = total / numbers.length;
        
        // print out elements
        System.out.printf("Elements in sorted order: \n");
        for (int i = 0; i < list.size(); i ++)
            System.out.printf("%s ", list.get(i));
        
        // print out sum of elements
        System.out.printf("\nSum of elements: \n");
        System.out.printf("%s ", total);
        
        // print out average of elements
        System.out.printf("\nAverage of elements: \n");
        System.out.printf("%s\n", average);
        
    } // end method main
    
} // end class ListTest\
