
/**
 * Defector class extends Organism class.
 */
public class Defector extends Organism {
    public Defector() {
        super();
    }

    /**
     * @return returns the type of this Organism as a string.
     */
    @Override
    String getType() {
        return "Defector";
    }

    /**
     * @return Creates an offspring organism and returns it.
     */
    @Override
    Organism reproduce() {
        return new Defector();
    }

    /**
     * @return the cooperation probability of this organism.
     */
    @Override
    double getCooperationPrbability() {
        return 0;
    }

    /**
     * @return whether or not the organism cooperates.
     */
    @Override
    boolean cooperates() {
        return false;
    }
    
    
}
