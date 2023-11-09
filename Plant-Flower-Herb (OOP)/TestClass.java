
package javaapplication57;


public class JavaApplication57 {

    public static void add(Plant[] plants, Plant p) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] == null) {
                plants[i] = p;
                break;
            }
        }
    }

    public static void remove(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null && plants[i].getName().equals(n)) {
                plants[i] = null;
                break;
            }
        }
    }

    public static Plant search(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null && plants[i].getName().equals(n)) {
                return plants[i];
            }
        }
        return null;
    }

    public static void display(Plant[] plants) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null) {
                System.out.println(plants[i].toString() + "\n");
            }
        }
    }
    public static void main(String[] args) {
        
         Plant[] plants = new Plant[5];
        add(plants, new Flower("Rose", "Red", true, true));
        add(plants, new Herb("Basil", "Green", true, "Summer"));
        add(plants, new Flower("Lily", "White", true, false));

        System.out.println("Initial Plants:");
        display(plants);

        remove(plants, "Rose");

        System.out.println("\nPlants after removal:");
        display(plants);

        Plant searchedPlant = search(plants, "Basil");
        if (searchedPlant != null) {
            System.out.println("\nFound Plant:\n" + searchedPlant.toString());
        } else {
            System.out.println("\nPlant not found.");
        }
    }
}
