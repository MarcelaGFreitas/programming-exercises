// Exercise to load a five-position array and then display the array on the screen.
import java.util.Scanner;

public class LoadArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] a = new int[5];
        System.out.println("Load a 5-position array");
        System.out.println();

        for (int i=0; i<5; i++){
            System.out.print("Enter number " + (i+1) + " of the array: ");
            a[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();
        System.out.println("5-position array loaded: ");
        for (int i=0; i<5; i++){
            System.out.print(a[i] + " ");
        }
    }
}
