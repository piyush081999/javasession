package Arrays;

import java.util.Arrays;

public class SingalDimentionalArray {

	public static void main(String[] args) {
		
		 // Array-- To store multiple values in single variable
		 // we can only replace the values in array, we cannot add or delete the value.
		 //array size is fixed
	
		
		int a[]= {10,20,30,40,50};
		
		  System.out.println(a.length); // finds out the length
		
		     System.out.println(a[2]); //Access the value of specific index
		     
		     a[3]=60;  //replace the value 
		   
		     // First way
		     System.out.println(Arrays.toString(a));
		     
		     //second way -using for loop
		     
		     for(int i=0;i<=4;i++) {
		      System.out.println(a[i]+" ");
		     }
		     
		     // third way -- using for each loop
		
		     /*   syntax-- for(datatype newVariable: oldVariable) {
		      
		      
		     }*/
		     
		for (int k:a) {
			
			System.out.print(k+"");
		}
		
		
		String  b []= {"rahul","ramsh","suresh"};
	
		for (String j:b) {
		
			System.out.println(j);
		}
	
	}
	
}
