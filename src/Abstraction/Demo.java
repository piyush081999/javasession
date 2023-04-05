package Abstraction;

public class Demo extends AbstractClass {

	@Override
	void methood2() {
		
		System.out.println("i am method 2");
		
	}

	
	public static void main(String[] args) {
		
		Demo obj =new Demo();
		obj.method1();
		obj.methood2();
	}
	
	
}
