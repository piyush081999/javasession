package InterviewPrograme;

import java.util.Arrays;

public class WordsCountJava {

	public static void main(String[] args) {
		
		String s= "hello i love plant";
		
		//System.out.println(s.length());
		
		String k[]= s.split(" ");
		
		System.out.println(Arrays.toString(k));
		
		System.out.println(k.length);// count of words
		
		
		for (int i=3;i>=0;i--) {
			
			System.out.println(k[i]);
		}
		
		
		
	}
	
}
