package exercise7;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberOccurrences = 0; 
        
        int result = countNumberOccurrences(number, numbers);
        System.out.println("Number occurrences: " + result);
    }

    public static int countNumberOccurrences(int number, int[] numbers) {
        
        int counter = 0;
        for  (int index = 0; index < numbers.length; index++) {
        if (number == numbers[index]) {
          counter++;
        }
       }
        return counter;
    }
}
