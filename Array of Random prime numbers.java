
package prob_1;

import java.util.Scanner;

public class Prob_1 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();

        System.out.println("Enter the start: ");
        int start = input.nextInt();

        System.out.println("Enter the end: ");
        int end = input.nextInt();

        int[] primeArray = generatePrime(size, start, end);

        for (int i = 0; i < size; i++) {
            System.out.print(primeArray[i] + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] generatePrime(int n, int s, int e) {
        int[] arr = new int[n];
        int count = 0;

        while (count < n) {
            int num = (int) (Math.random() * (e - s + 1)) + s;
            if (isPrime(num) == true) {
                arr[count] = num;
                count++;
            }
        }
        return arr;
    }
}
