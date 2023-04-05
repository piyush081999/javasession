 package InterviewPrograme;

public class ReverseTheWords {

	public static void main(String[] args) {
		
		
		//first do  the split and reverse
		
		// reverse the string and  then split
		
		
		String s="hello i love java";   //Out- olleh i evol avaj 
		  
		  String[] k=s.split(" ");
		  //k[]={"hello","i","love","java"}
		  
		  
		  for(int i=0;i<=k.length-1;i++) {  //outer loop
		   
		   String temp="";
		   for(int j=k[i].length()-1; j>=0; j--) { //inner loop
		     temp=temp+k[i].charAt(j);
		   }
		   
		   System.out.print(temp+" ");
		   
		  }
		  

		
		
		
		
	}
	
	
	
	
}
