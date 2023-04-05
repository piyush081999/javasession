package InterviewPrograme;

import java.util.HashSet;

public class RemoveDuplicateNumber {

	
	public static void main(String[] args) {
		
		String a="ramramramramram";
		
		char ch[]= a.toCharArray();
		
		HashSet<Character> hs= new HashSet<Character>();
		
		//filling the value inside hashset
		
		for(char b:ch) {
			
			hs.add(b);
		}
		
		
		// print hashset
		for(char k:hs) {
			
			System.out.println(k);
		}
	}
	
	
	
	
	
	
}
