/**
 * Cooperator class extends Organism class
 */
public class Cooperator extends Organism{


    public Cooperator(){
        super();
    }

    /**
     * @return returns the type of this Organism as a string.
     */
    @Override
    String getType(){
        return "Cooperator";
    }

    /**
     * @return Creates an offspring organism and returns it.
     */
    @Override
    Organism reproduce(){
        return new Cooperator();
    }

    /**
     * @return the cooperation probability of this organism.
     */
    @Override
    double getCooperationPrbability(){
        return 1.0;
    }

    /**
     * @return whether or not the organism cooperates.
     */
    @Override
    boolean cooperates() {
        
        return true;
    }

    
}
