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

        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                if(numbers[i] < numbers[j]){
                    int temporaryVar = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temporaryVar;
                }
            }
        }

        Thread.sleep(2000);
        System.out.print("\nArray in ascending order: ");
        for(int i=0; i<5; i++){
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}

