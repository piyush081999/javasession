package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList
		 //Default Capacity- 10 
		 //(currentcapacity*3/2)+1 --new capacity
	
	 ArrayList<Integer> obj=new ArrayList<Integer>();
	 
	    obj.add(10);
	    obj.add(20);
	    obj.add(30);
	    obj.add(40);
	    obj.add(30);
	    
	   System.out.println( obj.size());  //Size
	   
	   System.out.println(obj);
	   
	   obj.add(3, 60);  //Add 
	   
	   System.out.println(obj);
	   
	   obj.remove(0);  //Remove

	   System.out.println(obj);
	   
	   
	  System.out.println(obj.get(2));
	 
	   
	   //For each loop-
	   

	   for(int k:obj) {
	    
	    System.out.println(k);
	   }
	  
	  
	   System.out.println(" using for loop = = = = = = =  = = = =");
	   // For loop
	   
	   //0 1 2 3 4
	   for(int i=0;i<obj.size();i++) {
	  
	    System.out.println(obj.get(i));
	    
	    
	   }
	   
	 
	}  
	
}
