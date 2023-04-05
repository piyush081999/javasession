package JavaBasics;

public class Oprator {

	
	public static void main(String[] args) {
		
	// Arithmetic operators  -- Addition ,subtraction,division, multiplication, modulus 
		
		
		int a=10;
		int b=20;
        int c=a+b;
        
		System.out.println(a+b);
		System.out.println(c);
		
		
		 int d=123;
		 int k=23;
		 System.out.println(d-k);
		
		 int h=45;
		 int l=5;
		 System.out.println(h/l);
		 
		int m= 45;
		int v=2;
		System.out.println(m*v);
		
		int jh=43;
		int kh=2;
		System.out.println(jh%kh);
		
		
		// Increment oprator and decrement oprartor 
		
		System.out.println("==================");
		
		// Increment
		
		int p= 5;
	System.out.println(++p); //pre increment
	System.out.println(p);
	
	int q =7;
	System.out.println(q++);// post increment
	System.out.println(q);
		
		
	// Decrement
	
	int hg=7;
	System.out.println(--hg); // pre Decrement
	System.out.println(hg);
	
	int r=5;
	System.out.println(r--);// post Decrement
	System.out.println(r);
		
		
	// Assignment oprator--- <, >, <=, >= ,==	
		
		int z=10;
		
		System.out.println(z==10);
		System.out.println(z>10);
		System.out.println(z<10);
		System.out.println(z<=10);
		System.out.println(z>=10);
	
		
		// logical oprators--- And-&&  , or-||  , not--!
		
		int kj=15;
		System.out.println(kj>=15&&kj<=32);
        System.out.println(kj>=15||kj<=32); 
		System.out.println(!(kj>=15||kj>32));
		
		
		
		
		
	}
	
	
}


/*
Arithmetic operators
Assignment operators
Comparison operators
Logical operators



Arithmetic operators
 
+    Addition     Adds together two values             x + y 
- Subtraction     Subtracts one value from another     x - y 
* Multiplication  Multiplies two values                 x * y 
/ Division     Divides one value by another         x / y 
% Modulus         Returns the division remainder         x % y 
++ Increment     Increases the value of a variable by 1  ++x 
-- Decrement     Decreases the value of a variable by 1  --x 



 
Assignment Operators

Operator Example Same As
 =  x = 5 x = 5 
 +=  x += 3 x = x + 3 
 -=  x -= 3 x = x - 3 
 *=  x *= 3 x = x * 3 
 /=  x /= 3 x = x / 3 
 %=  x %= 3 x = x % 3 
 
 
 
 Java Comparison Operators
 
 Operator Name Example 
 == Equal to x == y 
 != Not equal x != y 
 > Greater than x > y 
 < Less than x < y  
 */
