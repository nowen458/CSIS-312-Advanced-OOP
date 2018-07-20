// Fig. 18.3: FactorialCalculator.java
// Method that assigns random numbers to elements in an array and prints them out
// CSIS 312-B01 LUO
import java.util.Random;

public class FactorialCalculator
{
   // output factorials for values 0-21
   public static void main(String[] args)
   {
      System.out.println("Nathaniel Owen - Assignment 6-2\n");
      
      int[] numbers = new int[100];
      
      for (int i = 0; i < numbers.length; i++)
        {
            Random rand = new Random();
            numbers[i] = rand.nextInt(100);
        }
      
      for (int i = 0; i < numbers.length; i++)
      {
          System.out.print(" " + numbers[i]);
      }
   }
} // end class FactorialCalculator