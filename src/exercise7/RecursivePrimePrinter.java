package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        
        for(int i = n; i > 0; i--) {
          if (isPrime(i)) {
            System.out.println(i);
          }
        }
    }

    public static boolean isPrime(int n) {
        
        boolean div = true;
        for (int i = 2; i < n; i++) {
          if (n % i == 0) {
            div = false;
            break;
          }
        }
        return div;
    }
}
