/*
Write a program that reads an array of 10 numbers. Then, read an integer x.
Count the multiples of x in the array and display them on the screen.
*/

import java.util.Scanner;
import java.util.Arrays;

public class FindMultiplesInArray {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int [] multipleNumbers = new int[10];

        int multipleCount = 0;

        System.out.println("=== Program to find multiples of a number in a 10-element array ===");
        Thread.sleep(2000);

        for(int i=0; i<10; i++){
            System.out.print("Enter a number for index " + i + " of the array: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nEnter a number to check for multiples in the array: ");
        int userNumber = sc.nextInt();
        while(userNumber == 0){
            System.out.print("Zero cannot be used to check for multiples.\nPlease enter another number: ");
            userNumber = sc.nextInt();
        }

        for(int i=0; i<10; i++){    
            if(numbers[i] % userNumber == 0){
                multipleNumbers[multipleCount] = numbers[i];
                multipleCount++;
            }
        }

        Thread.sleep(2000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Arrays.sort(numbers);
        System.out.print("Original array: ");
        for(int i=0; i<10; i++) System.out.print(numbers[i] + " ");

        Thread.sleep(2000);

        Arrays.sort(multipleNumbers, 0, multipleCount);
        if(multipleCount == 0){
            System.out.println("\nThere are no multiples of " + userNumber + " in the array.");
        } else {
            System.out.print("\nArray containing the multiples of " + userNumber + ": ");
            for(int i=0; i<multipleCount; i++) System.out.print(multipleNumbers[i] + " ");
        }
        sc.close();
    }
}
