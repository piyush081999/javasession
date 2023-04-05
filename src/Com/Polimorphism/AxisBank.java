package Com.Polimorphism;

public class AxisBank extends Bank {


	 public void rateOfInterest() {
	  
	  System.out.println("ROI is axis bank is 9");
	 }
	
	
	 public void method1fromAxisbank() {
		  
		  System.out.println("axis bank method1");
		 }
	 
	 
	 
	 public static void main(String[] args) {
		
		 // child class reference and child class object
		 // this wiil call parent and child method exception overriding method
		 
		 AxisBank obj=new AxisBank();
		 obj.rateOfInterest();             // this is override // child will call
		 obj.method1fromAxisbank();
		 obj.method1Frombank();
		 
		 // parent class reference and parent class object
		 // this will call only parent method
		 Bank obj1 =new Bank();
		 obj1.method1Frombank();
		 obj1.rateOfInterest();   // parent  class will call
		 
		 
		// parent class reference and child class object   // upcasting
		 // this will call all the parent method except override method
		 Bank obj2 =new AxisBank();
		 obj2.rateOfInterest();     // override method -- chid class call 
		 obj2.method1Frombank();
		
		 
		 // child reference and parenent object
		 
		// AxisBank obj3 =new Bank();  // downcasting
		// this will call all parent and child method--- override method (child) 
		 
		 Bank obj4 =new AxisBank();
		 
		 AxisBank obj5=(AxisBank)obj4;
		 obj5.rateOfInterest();
		 obj5.method1fromAxisbank();
		 obj5.method1Frombank();
	}
	 
	 
	 
	 
	 
	 
	 
	 
}
