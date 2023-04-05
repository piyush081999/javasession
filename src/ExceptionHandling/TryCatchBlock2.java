package ExceptionHandling;

public class TryCatchBlock2 {

	
		
		 
		//ArithmeticException
		 
		 public static void main(String[] args) {
			 
		  try {
		  int a=10;
		  int b=0;
		  System.out.println(a/b);
		  }
		  
		  catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println(" i have handled"); 
		  }
		  
		  catch(ArithmeticException e) {
		   System.out.println(" i have handled Arithemtci"); 
		  }
		 
		 
		 
	}
	
	
	
	
}
