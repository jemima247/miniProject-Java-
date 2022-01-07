public abstract class Organism {
    private int Energy; 
   
    /**
     * Constructor for objects of class Organism
     */
    public Organism(){
        Energy = 0;
    }

    /**
     * update the energy of the organism
     */
    public void update(){
        Energy = Energy + 1;
    }

    /**
     * get the energy of the organism
     */
     
    public int getEnergy(){
        return Energy;
    }

    /**
     * increase the energy of the organism
     */
    public void incrementEnergy(){
        Energy = Energy + 1;
    }

    /**
     * decrease the energy of the organism
     */
    public void decrementEnergy(){
        Energy = Energy - 1;
    }


    /**
     * Abstract method to be implemented by subclasses
     * 
     */

    /**
     * 
     * @return String representation of type of organism
     */
    abstract String getType();

    /**
     * @return Organism that was reproduced
     */
    abstract Organism reproduce();
    
    /**
     * @return the cooperation probability of the organism
     */
    abstract double getCooperationPrbability();


    /**
     * @return true or false if the organism is cooperative
     */
    abstract boolean cooperates();
    

    
}
