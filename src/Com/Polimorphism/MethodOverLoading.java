package Com.Polimorphism;

public class MethodOverLoading {

	// same method with  different paramteres

	// 3 different ways different parametres
	// count should be different
	// datatype should be different
	// sequence should be different
	 
	 public void addition(int a, int b) {
	  System.out.println( a+b);
	 }

	 public void addition(double a, double b) {
	  System.out.println( a+b);
	  
	 }
	 
	 
	 public static void main(String[] args) {
		
		 MethodOverLoading obj =new MethodOverLoading();
		 
		 obj.addition(12.5, 5.5);
	}
	
	
}
