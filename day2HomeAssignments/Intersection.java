package week3.day2HomeAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		
	   // Declare array 1
	   int[] array1 = {3, 2, 11, 4, 6, 7};
	   
	   // Declare array 2
	   int[] array2 = {1, 2, 8, 4, 9, 7};
	   
	   // Declare two arrayList to store the array1 and array2 values
	   
	   List<Integer> input1 = new ArrayList<Integer>();
	   List<Integer> input2 = new ArrayList<Integer>();
	  
	   // convert array1 values into input1
	   for (int num : array1) {
		   input1.add(num);
	}
	   // convert array2 values into input2
	   for (int num : array2) {
		   input2.add(num);
	   }
	   // Declare one more arraylist and copy the values from input1 list
	   List<Integer> intersection = new ArrayList<Integer>(input1);
	   
	   // To find intersection using retainall method
	   intersection.retainAll(input2);
	   
	   // To print it
	   System.out.println(intersection);
	   
	   


	}

}
