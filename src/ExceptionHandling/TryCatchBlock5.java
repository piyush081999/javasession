package ExceptionHandling;

public class TryCatchBlock5 {

	 public static void main(String[] args) {
		
		 try {
			   int a = 10;
			   int b = 0;
			   System.out.println(a / b);
			  }

			  catch (ArithmeticException e) {
			   System.out.println(" i have handled Arithemtci");
			  }

			  try {
			   int k[] = { 10, 20, 30, 40 };
			   System.out.println(k[5]);
			  }

			  catch (Exception e) {
			   System.out.println(" i am handling exception");
			  }

			  System.out.println("hello");

		 
	}
	
}
