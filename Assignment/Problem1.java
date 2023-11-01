package javaapplication46;

public class JavaApplication46 {

    public static long calculate(int year) {
        int numofyear, leap;
        numofyear = year - 2023;
        leap = ((numofyear - 1) / 4) + 1;

        long ans = (365*60*24) * numofyear - (365*60*24/2) * numofyear - (365*60*24/8) * numofyear + ((leap*60*24) - (leap*30*24) - (leap*180));
        return ans;
    }

    public static void main(String[] args) {

        long presentPopulation = 172954319;
        for (int i = 2024; i <= (2024 + 5); i++) {
            System.out.println("Population in " + i + " is: " + (calculate(i) + presentPopulation));

        }
    }
}
