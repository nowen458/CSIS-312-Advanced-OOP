// Fig. 18.3: FactorialCalculator.java
// Recursive factorial method.
// CSIS 312-B01 LUO
import java.util.*;

public class FactorialCalculator
{
   // recursive method factorial (assumes its parameter is >= 0
   public static long factorial(long number)
   {
      if (number <= 1) // test for base case
         return 1; // base cases: 0! = 1 and 1! = 1
      else // recursion step
         return number * factorial(number - 1);
   } 

   // output factorials for values 0-21
   public static void main(String[] args)
   {
      System.out.println("Nathaniel Owen - Assignment 6-1\n");
      
      // calculate the factorials of 0 through 21
      for (int counter = 0; counter <= 21; counter++) {
         // indent
         for (int space = 0; space < counter; space++) {
             System.out.print("   ");
         }
         // Print factorial
         System.out.printf("%d! = %d%n", counter, factorial(counter));
         // indent
         for (int space = 0; space < counter; space++) {
             System.out.print("   ");
         }
         // Print parameter number
         System.out.printf("Parameter number = %d%n", counter);
         // indent
         for (int space = 0; space < counter; space++) {
             System.out.print("   ");
         }
         // Print Recursive-call parameter
         System.out.printf("Recursive-call parameter = %d%n", (counter-1));
         
      }
   }
} // end class FactorialCalculator