package Com.Methods;

public class MethodsDemo {

	//this is non static method -- this method require object
	public void method1(){
		System.out.println("this is method1");
	}
	
	// this is static method -- this method doesnt require object
	public static void method2() {
		
		System.out.println("this is method2");
	}
	
	
	// method with return type
	public int method3() {
		
		int a=3;
		return a;
	}
	
	public void method4() {// void method type dont return type
	
		int a=5;
		
	}
	
	//parameterized method   
	                            // parameteres
	public void method5(String name,int age) {
		
	System.out.println(name);
	
	System.out.println(age);
	}
	
	
	
	public static void main(String[] args) {

	// To call the method
	// create the object of class 
	//Syntax---	classname obj= new classname();
		  
		MethodsDemo a=new MethodsDemo();
		a.method1();   // calling the non static method
		method2();       // calling the static method
		System.out.println(a.method3());
	    a.method4();
		a.method5("rahul",24);
		
	}
	
	
	
	
	
	
	
	
	
	
}
