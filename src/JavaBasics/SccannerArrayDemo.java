package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class SccannerArrayDemo {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		  
		  
		  int ar[]=new int[5];
		  ar[0]=sc.nextInt();
		  ar[1]=sc.nextInt();
		  ar[2]=sc.nextInt();
		  ar[3]=sc.nextInt();
		  ar[4]=sc.nextInt();
		  
		  System.out.println(Arrays.toString(ar));
	}
	
	
}
