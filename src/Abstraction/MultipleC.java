package Abstraction;

public class MultipleC implements MultipleA,MultipleB {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
	System.out.println("i am method 2");	
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
	
		MultipleC obj=new MultipleC();	
		
		obj.method();
		obj.method2();
	}
	
	
	
	
	
	
	
	
}
