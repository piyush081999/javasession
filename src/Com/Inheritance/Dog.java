package Com.Inheritance;

public class Dog extends Animal{

	public void method2() {
		
		System.out.println("waaaa");
	}
	
	
    public static void main(String[] args) {
		
    	Dog obj =new Dog();
    	
    	obj.drink();
    	obj.method2();
	}	
	
	
}
