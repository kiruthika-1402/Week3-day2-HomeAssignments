package week3.day2HomeAssignments;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] words = test.split(" ");
	
		for (int i = 0; i < words.length ; i++) {
			
			if (i%2==1) {
			
			char[] charArray = words[i].toCharArray();
			
			for (int j =  charArray.length-1; j >= 0; j--) {
				
				System.out.print(charArray[j]);	
			}
			System.out.print(" ");
		
			} 
			else {
				System.out.print(words[i]+" ");
			}
		}
	}
}
