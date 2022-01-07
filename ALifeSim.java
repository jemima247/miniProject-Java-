import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a simple implementation of the ALife simulation.
 * @author Oluwatobi Jemima Alabi
 * Assignment name: Assignment 4: Artificial Life Simulation
 * Assignment due date: December 10, 2021
 * Written/online sources used: none
 * Help obtained: none
 * “I confirm that the above list of sources is complete AND that I have not talked to anyone else (
 * e.g., CSC 207 students) about the solution to this problem.”
 */

public class ALifeSim {
    /**
     * main method to run the simulation.
     */
        public static void main(String[] args) {

        // confirm that all the needed parameters are present
        if(args.length != 4) {
            System.out.println("Usage: java ALifeSim <#/iterations> <#/cooperators> <#/defectors> <#/partial cooperators> ");
            System.exit(0);
        }

        // get the parameters
        int iterations = Integer.parseInt(args[0]);
        int cooperators = Integer.parseInt(args[1]);
        int defectors = Integer.parseInt(args[2]);
        int partialCooperators = Integer.parseInt(args[3]);

        // create the map to start the simulation
        Map<String, Integer> map = new HashMap<String, Integer>();
    
        map.put("Cooperator", cooperators);
        map.put("Defector", defectors);
        map.put("PartialCooperator", partialCooperators);

        //get the population aka the dish
        Population population = new Population(map);
        for (int i = 0; i < iterations; i++) {
            population.update();
        }

        // print the results
        System.out.println("Running: " + cooperators+ " cooperators, " + defectors + " defectors, " + partialCooperators + " partial cooperators");
        System.out.println("After "+ iterations + " ticks:");

        //store new population
        Map<String, Integer> results = population.getPopulationCounts();
        for (String key : results.keySet()) {
            System.out.println(key + " = " + results.get(key));
        }

        System.out.println("\n\n");
        System.out.println("Mean Cooperation Probability = " + population.calculateCooperationMean());

        
    }
        
}
