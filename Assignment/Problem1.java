package javaapplication46;

public class JavaApplication46 {

    public static void main(String[] args) {
        
        double BIRTH_RATE = 1.0 ;  
        double DEATH_RATE = 1.0 / 2.0;  
        double MIGRATION_RATE = 1.0 / 8.0;  
        double MINUTES_IN_YEAR = 365 * 24 * 60;  

      
        int currentPopulation = 172954319;  

        
        for (int year = 2024; year <= 2028; year++) 
        {
            double totalBirths = BIRTH_RATE * MINUTES_IN_YEAR;
            
            double totalDeaths = DEATH_RATE * MINUTES_IN_YEAR;
            
            double totalMigrants = MIGRATION_RATE * MINUTES_IN_YEAR;

            double netPopulationChange = totalBirths - totalDeaths - totalMigrants;
            if(year== 2024 || year == 2028)
            {
            	netPopulationChange = netPopulationChange + (1440-720-180);
            }
            currentPopulation += (int) netPopulationChange;

            System.out.println("Estimated Population in " + year + ": " + String.format("%,d", currentPopulation));
        }
    }
}
