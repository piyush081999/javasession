
package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		
	cars.add("volvo");
	cars.add("main");
	 cars.add("BMW");
	 cars.add("Ford");
	
	Iterator<String> it = cars.iterator();
	
	   System.out.println( it.next());
	   System.out.println(it.next());
	    
	    
	    
	    while(it.hasNext()) {
	    	
	    	System.out.println(it.next());
	    }
	
	}
	
	
	
}
