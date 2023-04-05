package InterviewPrograme;

public class StringReverse {

	public static void main(String[] args) {
		
		 //Program-1 -reveres the string
		 
	String s="Rahul";	
		
   for (int i=4;i>=0;i--) {
	   System.out.print(s.charAt(i));
   }
	
   
   // reverse the string  using temp 
   String s2= "manish";
   
   String temp="";
   
   for (int i=4;i>=0;i--) {
	   temp=temp+s.charAt(i);
	  
   }
   System.out.println(temp);
   
}

	  //print alternate characters
	/*  
	  String p1="rajesh";
	 
	  for(int i=0;i<=p1.length()-1;i=i+2) {
	   System.out.print(p1.charAt(i));
	  }*/
	  
	
	
	
	

	
	
	
	
	
	
}
	
	


	 
	 