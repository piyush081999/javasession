package JavaBasics;

public class StringOprations {

	public static void main(String[] args) {
		
		// LEnght will always strats with 1
		  //index will always start with 0
		  
		     String s="i love Flower"; //
		     System.out.println(s);
		     
		   //Length of the string
		     System.out.println(s.length());
		     
		    //convert string to uppercase
		    System.out.println(s.toUpperCase());
		     
		    //convert string to lowercase
		    System.out.println(s.toLowerCase());
		   
		    // gives the chracter at specific position
		  System.out.println(s.charAt(3)); 
		   
		  System.out.println(s.charAt(1)+s.charAt(2));  //This will give the answer in ascci  value
		    
		    //concat 
		   
		   System.out.println(s.concat(" "+"hello"));  //First way
		 
		   String p= s+" "+"hello";  //Second way
		   System.out.println(p);
		    
		     
		 
		   String k ="hello";
		   String j="java";
		   System.out.println(k+" "+j);
		     
		// EqualIgnore case
		   
		   String s1="Hello java";
		   String s2="Hello";
		  
		   
		   System.out.println(s1.equalsIgnoreCase(s2));   //true
		   System.out.println(s1.equals(s2)); //false
		   System.out.println(s2.contains(s1)); // false
		   
		   //Trim -- remove the leftmost and rightmost spaces of the string
		    String  s3="   hello   java   ";
		    System.out.println(s3.trim());
		    
		    
		    // backslash character-- escape character --    \ 
		     
		   
		    String s4="hello i love \"java\" ";
		    System.out.println(s4);
		    
		  
		    String s5="i love \\\\\\ backslash character";
		    System.out.println(s5);
		    
		  
		    String s6="i love  character";
		    System.out.println(s6);
		    
		    
		 
		    // replace --  // sir se puchna hai
		    
		   String s8="i love java";
		   System.out.println(s8.replace("", ""));
		    
		   
		  String s9= "i love java "; 
		  
		  //bigin index  end index+1
		    
		   System.out.println(s9.substring(2,6));
		    
		   System.out.println(s9.substring(2));   
		   
		   System.out.println(s9.startsWith("i"));
		   
		   
		
		
	}
	
	
	
}
