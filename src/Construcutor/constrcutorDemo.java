package Construcutor;

import java.lang.reflect.Constructor;

public class constrcutorDemo {

	 // 0 argument constrcutor
	 // parameterized
	 //default constrcutor
	 
	 //Constrcutor rules--
	 //constructor name should be same as class name
	 //constrcuttor does not have any return type
	 //construtor will call automatically when we create the the object.
	 // A constructor in Java is a special method that is used to initialize objects.
	 
	 int x;
	 
	 public constrcutorDemo() {
	  x=5;
	  System.out.println(x);
	 }
	 
	 
	 public constrcutorDemo(int a) {
	  x=a;
	  System.out.println(x);
	 }
	 
	 
	 public static void main(String[] args) {
	  
		 constrcutorDemo obj=new constrcutorDemo();
		 constrcutorDemo bj1=new constrcutorDemo(6);
	  
	
	 }
}
