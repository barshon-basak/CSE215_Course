
package javaapplication56;


public class JavaApplication56 {

  
    public static void main(String[] args) {
         PartTimeEmployee partTimeEmployee = new PartTimeEmployee("John Doe", 30, "123 Main St", "HR", "Assistant", 20.0, 15.0);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Jane Smith", 35, "456 Elm St", "Finance", "Manager", 15000.0, 25.0);

        System.out.println("Part-Time Employee:");
        System.out.println(partTimeEmployee.toString());

        System.out.println("\nFull-Time Employee:");
        System.out.println(fullTimeEmployee.toString());
    }
    
}
