package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
		int a[] = { 10, 20, 30, 40 };
		   System.out.println(a[5]);
		  }
		  catch(Exception e) {
			   
			   System.out.println("exception handled");
		  
		  } 
		  finally {  //Finally block will execute always
		   
		   System.out.println("hello123");
		   
		  }
		  
		  System.out.println("hello1234");

	}
	
}
