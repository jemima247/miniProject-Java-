/**
 * PartialCooperator class extends Organism class
 */
public class PartialCooperator extends Organism{


    public PartialCooperator(){
        super();
    }

    /**
     * @return returns the type of this Organism as a string.
     */
    @Override
    String getType() {
        return "PartialCooperator";
    }

    /**
     * @return Creates an offspring organism and returns it.
     */
    @Override
    Organism reproduce() {
        return new PartialCooperator();
    }

    /**
     * @return the cooperation probability of this organism.
     */
    @Override
    double getCooperationPrbability() {
        return 0.5;
    }

    /**
     * @return whether or not the organism cooperates.
     */
    @Override
    boolean cooperates() {
        if(Math.random() > getCooperationPrbability()){
            return true;
        }
        return false;
    }
    
    
}