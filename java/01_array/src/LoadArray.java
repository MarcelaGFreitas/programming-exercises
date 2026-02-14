// Exercise to load a five-position array and then display the array on the screen.
import java.util.Scanner;

public class LoadArray {

    // Class constant that defines the array size
    private static final int ARRAY_SIZE = 5;

    // Method responsible for loading values into the array
    private static void loadArray(Scanner sc, int[] array) {
        System.out.print("Load a " + ARRAY_SIZE + "-position array\n");
        for(int i=0; i < array.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");

            // Input validation: ensures the user enters an integer
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();    // Discards invalid input
                System.out.print("Enter number " + (i+1) + ": ");
            }

            array[i] = sc.nextInt();
        }
    }

    // Method responsible for displaying the array contents
    private static void printArray(int [] array) {
        System.out.println("\nArray loaded:");

        for(int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
    // Entry point of the program
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[ARRAY_SIZE];

        loadArray(sc, numbers);
        printArray(numbers);

        sc.close();
    }
}
