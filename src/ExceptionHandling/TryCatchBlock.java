package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		

		 //ArrayIndexOutOfBoundsException
		
		  try {
			  
		   int a[] = { 10, 20, 30, 40 };
		   System.out.println(a[2]);
		   
		    } catch ( Exception e) {
		         e.printStackTrace();//To print the details of the exception
		   System.out.println("hello i have handled the exception");
		  }
		  System.out.println("hello123");
		 }

		
   }

		//Syntax
		/*
		 * try { // Block of code to try } catch(Exception e) { // e' stands for
		 * exception, but you can rename it anything you like, however, the data type
		 * has to remain 'Exception') The 'e' variable stores an exception-type object
		 * in this case. // Block of code to handle errors }
		 */
		
		
		

	
	

