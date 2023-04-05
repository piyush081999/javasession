package Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Duplicate are not allowed
		 // Sequence is not fixed
		 
		 //Set---Interface
		 //HashSet- Class
		 
		//worked based on hashset and hashmap
		 //initial capacity -16
		 //load factor 0.75
		
		    HashSet<Integer> obj=new HashSet<Integer>();
		    
		    obj.add(10);
		    obj.add(20);
		    obj.add(30);
		    obj.add(40);
		    obj.add(30);
		    
		  
		    System.out.println(obj);
		    
		  
		    obj.add(60); //Randomly it will add to any position
		    obj.remove(20);  //Remove the object
		    
		   
		    System.out.println(obj);  //
		    
		    
		    //For each loop-
		    
		    for(int k:obj) {
		     
		     System.out.println(k);
		    }
		    
		
	}
	
	
	
}
