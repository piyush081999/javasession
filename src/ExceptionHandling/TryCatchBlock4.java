package ExceptionHandling;

public class TryCatchBlock4 {

	 public static void main(String[] args) {
		  try {
			   int a = 10;
			   int b = 0;
			   System.out.println(a / b);
			  }

			  catch (ArithmeticException e) {
			   System.out.println(" i have handled Arithemtci");
			  }

			  catch (Exception e) {
			   System.out.println(" i have handled Excpetion");
			  }

	}
	
	
	
	
	
	
	
	
	
	
}
