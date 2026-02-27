import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("=== Fill an array with 5 numbers and sort the array in ascending order ===");
        Thread.sleep(1000);
        System.out.println();

        for(int i=0; i<5; i++){
            System.out.print("Enter a number for position " + i + " of the array: ");
            numbers[i] = sc.nextInt();
        }

        Thread.sleep(1000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.print("Original array: ");
        for(int i=0; i<5; i++) System.out.print(numbers[i] + " ");

        boolean alreadySorted = false;

        for(int i=0; i<numbers.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<numbers.length-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                    int temporaryVar = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temporaryVar;
                    swapped = true;
                }
            }
            if(!swapped){
                System.out.print("\nThe array is already sorted in ascending order.");
                alreadySorted = true;
                break;
            }
        }

        Thread.sleep(3000);
        if(!alreadySorted){
            System.out.print("\nArray in ascending order: ");
            for(int i=0; i<5; i++){
                System.out.print(numbers[i] + " ");
            }
        }
        
        sc.close();
    }
}

