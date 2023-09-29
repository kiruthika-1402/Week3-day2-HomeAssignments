package week3.day2HomeAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		int a = text1.length();
		int b = text2.length();
		
		if (a==b) {
			System.out.println("The length of the two strings are equal");
		} else {
            System.out.println("The length of the two strings are not equal");
		}
		
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
				
				if (charArray1.equals(charArray2)) {
					System.out.println("The given string is anagram");
				} 
				else {
                     System.out.println("The given string is not an anagram");
				}
			}
		
	}
	



