// SentenceCreator.java
// SentenceCreator creates a sentence based off of words from WordCreator
// CSIS 312-B01 LUO

public class SentenceCreator {
    
    // Create instance variable of WordCreator
    WordCreator wordCreator = new WordCreator();
    
    // get method
    public void getSentence() {
        StringBuilder word1 = new StringBuilder(wordCreator.getArticle());
        StringBuilder word2 = new StringBuilder(wordCreator.getNoun());
        StringBuilder word3 = new StringBuilder(wordCreator.getVerb());
        StringBuilder word4 = new StringBuilder(wordCreator.getPrep());
        StringBuilder word5 = new StringBuilder(wordCreator.getArticle());
        StringBuilder word6 = new StringBuilder(wordCreator.getNoun());
        
        // Capitalize first letter of first word
        String word1Upper = word1.toString().substring(0,1).toUpperCase() + word1.substring(1); // Converts to string to capitalize first letter
        word1.delete(0,10); // Deletes value of word1
        word1.insert(0,word1Upper); // Re-assigns value to StringBuilder variable from String
        
        // Print out StringBuilder variables
        System.out.printf("%s: %s%n","Random sentence", word1.append(" ").append(word2).append(" ")
                .append(word3).append(" ").append(word4).append(" ").append(word5).append(" ").append(word6).append("."));
    }
} // end class SentenceCreator
