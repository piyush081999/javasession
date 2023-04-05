package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimentionalArray {

	
	public static void main(String[] args) {
		
		int a[][]= {{10,20,30,40},{50,60,70,80}};
		  
		
		System.out.println(a[0][1]);
		
		System.out.println(a[1][1]);
		
		  System.out.println(a.length);
		  
		  System.out.println(Arrays.toString(a[0]));
		  
		System.out.println(a[0].length);
		 
		System.out.println(Arrays.toString(a[1]));
		
		System.out.println(a[1].length);
		 
		 System.out.println(a[0].length+a[1].length);
		 
		 
		  for (int i = 0; i < a.length; i++) {   //outer for loop
			  
			  
		 for (int j = 0; j < a[i].length; j++) { //inner for loop
			 
			    System.out.print(" "+a[i][j]); 
		 }
		 
		 
		 
		 
		  }	 
		 
		 
		 
		 
	}
	
	
	
}
