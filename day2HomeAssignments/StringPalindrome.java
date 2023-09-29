package week3.day2HomeAssignments;

public class StringPalindrome {

	public static void main(String[] args) {
		
		// Declare the string
		String word = "Madam";
		
		// Declare the empty string to store reversed value
		StringBuffer revWord = new StringBuffer("");
	
		// Convert the string into to charArray
		char[] charArray = word.toCharArray();
		
		// Reverse for loop to iterate from the last character of character array to the first character
		for (int i = charArray.length-1; i >= 0 ; i--) {
			
		// Append the character array to the reversed string
		StringBuffer append = revWord.append(word);    
		}     
	    // Print the given string
		System.out.println("Given string is :"+ word);
		
		// Print the reversed string
		System.out.println("Reversed string is :"+ revWord);
		
		// Compare the two strings and print the required output
		if (word.equals(revWord)) {
				
			System.out.println("Its a palindrome");
		} 
		else {
                
			System.out.println("Its not a palindrome");
		}
			
			
				

	}

}
