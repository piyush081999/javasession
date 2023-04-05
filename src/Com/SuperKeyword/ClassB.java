package Com.SuperKeyword;

public class ClassB extends ClassA {

	int no=20;
	
	void show (int n) {
		
		
		System.out.println(n);
		
		System.out.println(this.no);
		
		   System.out.println(super .no); 
		
	}
	
	
	  public static void main(String[] args) {
		
		  ClassB obj = new ClassB ();
		  
		  obj.show(40);
		  
	}
	
	
	
	
	
}
