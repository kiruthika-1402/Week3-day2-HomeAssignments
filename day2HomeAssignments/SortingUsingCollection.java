package week3.day2HomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
	    
		List<String> comName = new LinkedList<String>();
		
		// Add the collections to a list
		comName.add("HCL");
		comName.add("Wipro");
		comName.add("Aspire system");
		comName.add("CTS");
		
		// Sort the list
		Collections.sort(comName);
		
		// Reverse the list
		Collections.reverse(comName);
	    
		// Iterate the values using for each loop
		for (String cN : comName) {
		
		// To print
		System.out.println("Sorted strings are :"+ cN);
			
		}
		
		
        
		

}
}