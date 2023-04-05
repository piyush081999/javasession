package InterviewPrograme;

public class copysir {

	public static void main(String[] args) {

		  //Program-1 -reveres the string
		  String k="Rahul"; 
		  for(int i=k.length()-1;i>=0;i--) {
		   System.out.println(k.charAt(i));
		 
		  }
		  

		  //Program-1 -reveres the string- using temp
		  String s="Rahul";  
		  String temp="";
		  for(int i=k.length()-1;i>=0;i--) {
		   temp=temp+s.charAt(i);
		 
		  }
		  System.out.println(temp);
		  

		  
		  //print alternate characters
		  
		  String s1="Rahul";
		  for(int i=0;i<=s1.length()-1;i=i+2) {
		   System.out.print(s1.charAt(i));
		  
		  
		  
		 }

	}
	
}
