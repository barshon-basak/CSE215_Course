import java.io.*;
import java.util.Scanner;

public class NumberFileSumAverage {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integers (enter a negative number to stop):");

            // Create a file for writing the input numbers
            File outputFile = new File("numbers.txt");
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            int num;
            while (true) {
                num = scanner.nextInt();
                if (num < 0) {
                    break;
                }
                writer.write(Integer.toString(num));
                writer.newLine();
            }
            writer.close();

            // Create a file for reading the input numbers
            File inputFile = new File("numbers.txt");
            Scanner fileScanner = new Scanner(inputFile);

            int sum = 0;
            int count = 0;

            while (fileScanner.hasNext()) {
                num = Integer.parseInt(fileScanner.nextLine());
                sum += num;
                count++;
            }

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            } else {
                System.out.println("No numbers were entered.");
            }

            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }
    }
}
