package week3.day2HomeAssignments;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		// Declare the string
		String test = "changeme";
		
		// Convert string into to charArray
		char[] charArray = test.toCharArray();
		
		// Implement a loop to iterate through each character of the string
		for (int i = charArray.length; i >=0 ; i--) {
		
		// to find the odd index
		if (i % 2 !=0) {
		
		// Change the character to uppercase
		   charArray[i]= Character.toUpperCase(charArray[i]);
		}
		}    
		// To print it
		 System.out.println(charArray);
              
	}

}
