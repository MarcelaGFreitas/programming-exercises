/*
EXERCISE 04 – Count Numbers and Calculate Average
Description: Read integers until the user types 0. At the end, display:
- How many numbers were entered
- The average of the numbers
PS: without using any built-in methods - only programming logic
*/

import java.util.Scanner;
import java.util.ArrayList;

public class CountAndAverage {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();

        int number = 0;
        int sum = 0;
        int average = 0;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if (number != 0){
                numbers.add(number);
                sum += number;
            }
        } while (number != 0);

        for(int i=0; i<numbers.size(); i++){
            for(int j=0; j<numbers.size()-1-i; j++){
                if(numbers.get(j) > numbers.get(j+1)){
                    int tempVar = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j+1, tempVar);
                }
            }
        }

        average = sum / numbers.size();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("List: " + numbers);
        System.out.println("List size: " + numbers.size());
        System.out.println("Average of the numbers in the list: " + average);

        sc.close();
    }
}
