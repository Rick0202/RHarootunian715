
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;




public class Main { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        // Create an array with 10 elements
        int[] numbers = new int[10];
        System.out.println("This program will have you input 10 predetermined numbers into an array and the program will remove the duplicates and print the new array to the screan.\n");

        for (int i = 0; i < numbers.length; i++) { 
            System.out.println("Please enter a number: "); 
            numbers[i] = input.nextInt(); 
            System.out.println("\nYou have entered " + (i + 1) + " so far."); 
        } 
        // Pass the array to the method to eliminate duplicate numbers
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Print the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] list) { 
            Set<Integer> uniqueElements = new LinkedHashSet<>(); 
            for (int num : list) { 
                uniqueElements.add(num); 
            } 
            int[] result = new int[uniqueElements.size()]; 
            int index = 0; 
            for (int num : uniqueElements) { 
                result[index++] = num; 
            } 
            return result; 

        
    }
    }