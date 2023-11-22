package javaapplication72;
import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");  
        cityList.add("Denver"); 
        cityList.add("Paris"); 
        cityList.add("Miami");   
        cityList.add("Seoul");   
        cityList.add("Tokyo");   
     
        System.out.println("List size? " + cityList.size());

        // Check if "Miami" is in the list
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));

        // Find the location of "Denver" in the list
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));

        // Check if the list is empty
        System.out.println("Is the list empty? " + cityList.isEmpty()); // Print false
    }
}

