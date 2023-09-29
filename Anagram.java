package week3.day2HomeAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	    
		// Declare the two strings
		String text1 = "stops";
		String text2 = "potss";
		
		// To find the length of the two strings 
		int a = text1.length();
		int b = text2.length();
		
		// Print the length of the two strings are equal 
		if (a==b) {
			System.out.println("The length of the two strings are equal");
		} else {
            System.out.println("The length of the two strings are not equal");
		}
		// Convert the two strings into array
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		// Sort the two Arrays 
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		// Print the required output
	    if (charArray1.equals(charArray2)) {
	    	
			System.out.println("The given string is anagram");
				} 
		else {
			
            System.out.println("The given string is not an anagram");
				}
			}
		
	}
	



