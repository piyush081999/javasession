package ExceptionHandling;

public class TryCatchBlock3 {

	public static void main(String[] args) {
		
		
			 
			  try {
			  int a=10;
			  int b=0;
			  System.out.println(a/b);
			  }
			  
			  catch(Exception e) {
			   System.out.println(" i have handled"); 
			  }
			  //Compile time error
	//		  catch(ArithmeticException e) {
			   System.out.println(" i have handled Arithemtci"); 
			  }
	}
	
	
	
	

