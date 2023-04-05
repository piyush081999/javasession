package EnCapsulation;

public class demo2 {

	public static void main(String[] args) {
		
		Demo obj= new Demo();
		
		obj.setName("Rahul"); // this is not sequre
		
		System.out.println(obj.getName());
	}
	
	
}
/*
 * Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
 */