// SentenceTest.java
// SentenceTest calls SentenceCreator to form a random sentence
// CSIS 312-B01 LUO

public class SentenceTest {
    public static void main(String[] args) {
        
        // Print out name of student
        System.out.println("Nathaniel Owen - Assignment 4\n");
        
        // Create instance variable of SentenceCreator
        SentenceCreator sentenceCreator = new SentenceCreator();
        
        // for loop to run getSentence()
        for (int i = 0; i<=19; i++) {
            sentenceCreator.getSentence();
        } // end for loop
    }
} // end class SentenceTest
