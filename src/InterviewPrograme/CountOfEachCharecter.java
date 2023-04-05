package InterviewPrograme;

import java.util.HashMap;

public class CountOfEachCharecter {

	public static void main(String[] args) {
		
		String s= "i love apple";
		
		char ch[] =s.toCharArray();
		
		HashMap<Character,Integer>hs =new HashMap<Character,Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			   
		 if (hs.containsKey(ch[i])) {
		  hs.put(ch[i], hs.get(ch[i]) + 1);

			   }
			   
		  else {
		  hs.put(ch[i], 1);
			   
			   }

			  }
			  
			  
		  for(char k:hs.keySet()) {
			   System.out.println(k+" "+hs.get(k));
			  }
		
		
	}
	
	
	
	
}
