package JavaBasics;

public class TypeCasting {

	public static void main(String[] args) {
		
	// widening casting -- Automatically -- implicit 
		// - converting a smaller type to a larger type size--implicit type casting
		
	//	byte -> short -> char -> int -> long -> float -> double


	
		
		int a=10;
		float b=a;
		
		System.out.println(b);
		System.out.println(a);
		
		
		int c=54;
		double d=c;
		System.out.println(d);
		
	   	
		short k=1254;
		long h=k;
		System.out.println(h);
		
		byte hf =46;
		char fd =(char)hf;
		System.out.println(fd);
		
		char po='h';
		int de =po;
		System.out.println(de);
	
		
		
		
		// narrowing casting -- manually-- Explicit --- 	converting a larger type to a smaller size type----explicit type casting
		
		//double -> float -> long -> int -> char -> short -> byte

		
		float kj =6.5f;
		int r= (int)kj;
		System.out.println(r);
		
		double jg =42;
		short jh =(short)jg;
		System.out.println(jh);
		
		double op= 4.2;
		short km=(short)op;
		System.out.println(km);
		
		
		
		
		
	}
	
	
}
