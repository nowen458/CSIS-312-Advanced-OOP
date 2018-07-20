// Pair.java
// Generic class with two type parameters
// CSIS 312-B01 LUO

public class Pair<F, S> {
    
    // define element variables
    private F first;
    private S second;
    
    // Pair constructor method
    public Pair(F first, S second) {
    this.first = first;
    this.second= second;
    }
    
    // set method for F
    public void setFirst(F first) {
        this.first = first;
    }
    
    // get method for F
    public F getFirst() {
        return first;
    }
    
    // set method for S
    public void setSecond(S second) {
        this.second=second;
    }
    
    // set method for F
    public S getSecond() {
        return second;
    }
} // end class Pair
