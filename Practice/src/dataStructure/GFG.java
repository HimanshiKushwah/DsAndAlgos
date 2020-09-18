package dataStructure;

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List;

public class GFG {
	// Function to insert x in arr at position pos 
    private static void addElement( 
            Integer[] arr, int element, 
            int position) 
        { 
            // Coverting array to ArrayList 
            List<Integer> list = new ArrayList<>( 
                Arrays.asList(arr)); 
              
            // Adding the element at position 
            list.add(position - 1, element); 
              
            // Converting the list back to array 
            arr = list.toArray(arr); 
      
            // Printing the original array 
            System.out.println("Initial Array:\n"
                            + Arrays.toString(arr)); 
      
            // Printing the updated array 
            System.out.println("\nArray with " + element 
                            + " inserted at position "
                            + position + ":\n"
                            + Arrays.toString(arr)); 
        } 
          
        // Drivers Method 
        public static void main(String[] args) 
        { 
            // Sample array 
            Integer[] arr = { 1, 2, 3, 4, 5, 
                            6, 7, 8, 9, 10 }; 
          
            // Element to be inserted 
            int element = 50; 
          
            // Position to insert 
            int position = 5; 
          
            // Calling the function to insert 
            addElement(arr, element, position); 
        } 
}
