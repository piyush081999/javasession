package InterviewPrograme;

public class MaximumNumberFromArray {

	public static void main(String[] args) {
		
		int a[]= {10,32,20,45};
		

		  int temp;
		  for (int i=0; i < a.length;i++) { //outer loop
		   
		   for (int j = i+1;j < a.length;j++) { //inner loop
		    
		    if (a[i] < a[j]) {   //  10 < 30
		     temp = a[i];     //temp=10
		     a[i] = a[j];     // a[i]=30
		     a[j] = temp;     // a[j]= 10
		    }
		   
		   }
		  }
		  System.out.print(a[1]);
			
			
			
			
		}
		
	
	
	
	
	
	
	
	
	
	
}
