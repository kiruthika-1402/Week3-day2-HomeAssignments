package week3.day2HomeAssignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] array =  {3, 2, 11, 4, 6, 7};
		
		Arrays.sort(array);
		
		if (array.length >=2) {
			
			int secondLargest = array[array.length - 2];
			
			System.out.println("The second largest element is :"+secondLargest);
		} 
		else {
			
			System.out.println("The array does not have second largest number");
		}

	}

}
