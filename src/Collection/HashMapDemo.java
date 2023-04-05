package Collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Null values
		 // Hashmap: It can contain a single null key and multiple null values. 
		 // Hashset: It can contain a single null value.
		 // ArraList- multiple null values are allowed
		
		
		
		HashMap<String,String> obj=new HashMap<String,String>();
		
		obj.put("MH","MUM");
		obj.put("KR","BLR");
		obj.put("GUJ","Gandhinagar");
		obj.put("KR","BLR");
		
		// i want to access value the specific key
		
		System.out.println(obj.get("MH"));
		
	// i want to print only keys
		
		for(String k:obj.keySet()) {
			
			System.out.println(k);
		}
		
		
		// i want to print only values
		
		for(String k:obj.values()) {
			
			System.out.println(k);
		}
		
		// print keys and values
		
	for(String k:obj.keySet()) {
		
		System.out.println(k+" "+obj.get(k));
	}
		 
	
		
	}
	
	
	
}
