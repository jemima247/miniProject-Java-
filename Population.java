import java.util.ArrayList;
import java.util.Map;

public class Population{
    private ArrayList<Organism> organisms;
    
    

    Population(Map<String, Integer> counts){
        organisms = new ArrayList<Organism>();
        for (String key : counts.keySet()){
            int count = counts.get(key);
            if(key.equals("Cooperator")){
                for (int i = 0; i < count; i++){
                    Organism newO = new Cooperator();
                    organisms.add(newO);
                }
                
            }
            else if(key.equals("Defector")){
                for (int i = 0; i < count; i++){
                    Organism newD = new Defector();
                    organisms.add(newD);
                }
                
            }
            else if(key.equals("PartialCooperator")){
                for (int i = 0; i < count; i++){
                    Organism newP = new PartialCooperator();
                    organisms.add(newP);
                }
                
            }
            else{
                throw new IllegalArgumentException("Invalid organism type: " + key);
            }

        }
    }

    public void update(){
        for (Organism organism : organisms){
            organism.update();
            if(organism.cooperates()){
                organism.decrementEnergy();
                for (int i = 0; i < 8; i++){
                    int index = (int) (Math.random() * organisms.size());
                    organisms.get(index).incrementEnergy();
                }
            }
            if(organism.getEnergy() >= 10){
                int index = (int) (Math.random() * organisms.size());
                organisms.set(index, organism.reproduce());
            }
        }
    }

    public double calculateCooperationMean(){
        double cooperationSum = 0;
        for (Organism organism : organisms){
            cooperationSum += organism.getCooperationPrbability();
        }
        return cooperationSum / organisms.size();
    }

    public Map<String, Integer> getPopulationCounts(){
        Map<String, Integer> counts = new java.util.HashMap<String, Integer>();
        counts.put("Cooperator", 0);
        counts.put("Defector", 0);
        counts.put("PartialCooperator", 0);
        for (Organism organism : organisms){
            if(organism instanceof Cooperator){
                counts.put("Cooperator", counts.get("Cooperator") + 1);
            }
            else if(organism instanceof Defector){
                counts.put("Defector", counts.get("Defector") + 1);
            }
            else if(organism instanceof PartialCooperator){
                counts.put("PartialCooperator", counts.get("PartialCooperator") + 1);
            }
        }
        return counts;
    }
}