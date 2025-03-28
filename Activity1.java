import java.util.Scanner;

public class Activity1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 integer values from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Initialize the largest and second largest variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest values
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Display the results
        System.out.println("Largest value: " + largest);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest value: " + secondLargest);
        } else {
            System.out.println("There is no second largest value (all numbers might be the same).");
        }

        scanner.close();
    }
}


    
    

