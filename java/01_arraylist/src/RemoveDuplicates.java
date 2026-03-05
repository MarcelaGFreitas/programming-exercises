import java.util.ArrayList;    
import java.util.Scanner;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> originalList = new ArrayList<>();    
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>();  
    
        for(int i=0; i<10; i++){
            System.out.print("Enter a number: ");
            originalList.add(sc.nextInt());
        }
        
        // Sort in ascending order
        Collections.sort(originalList);

        // Iterate through the original list
        for(int i=0; i<originalList.size(); i++){
            int value = originalList.get(i);   
            
            boolean exists = false;   

            for(int j=0; j<listWithoutDuplicates.size(); j++){    
                if(listWithoutDuplicates.get(j) == value){    
                    exists = true;    
                    break;
                }
            }

            if(!exists){    
                listWithoutDuplicates.add(value);
            }
        }
        System.out.println("\nList without repeated numbers:");

        for(int i=0; i<listWithoutDuplicates.size(); i++){
            System.out.print(listWithoutDuplicates.get(i) + " ");
        }
        sc.close();
    }
}