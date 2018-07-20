// WordCreator.java
// WordCreator stores words in an array and selects them randomly from get methods
// CSIS 312-B01 LUO
import java.util.Random;

public class WordCreator {
    
    // Declare arrays
    String[] articleArray = {"the", "a", "one", "some", "any"};
    String[] nounArray = {"boy", "girl", "dog", "town", "car"};
    String[] verbArray = {"drove", "jumped", "ran", "walked", "skipped"};
    String[] prepArray = {"to", "from", "over", "under", "on"};
    
    // Randomizer method that generates a random number
    int randomizer() {
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(5);
        return random;
    }
    // get methods
    public String getArticle() {
        int i  = randomizer(); // assigns random number to i
        return articleArray[i];
    }
    
    public String getNoun() {
        int i  = randomizer();// assigns random number to i
        return nounArray[i];
    }
    
    public String getVerb() {
        int i  = randomizer();// assigns random number to i
        return verbArray[i];
    }
    
    public String getPrep() {
        int i  = randomizer();// assigns random number to i
        return prepArray[i];
    }
} // end class WordCreator
