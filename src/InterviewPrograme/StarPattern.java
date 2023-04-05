package InterviewPrograme;

public class StarPattern {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 5; i++) { // Outer loop

			   for (int j = 1; j <= i; j++) { // inner loop
			    
			    System.out.print( "*"+ " ");
			   }
			   System.out.println();
			  }
			 }
		
		
		
		
	
}
//It will starts with outer loop--
//If condition of outer loop is true then it will come to inner loop
//if inner loop condition is true then it will come inside the inner loop
//it will continue on inner loop till it gets break-
//if condition break of inner loop,then it will go to outer loop
//if outer loop condition is true then it will come to inner loop
//now fresh inner loop will start