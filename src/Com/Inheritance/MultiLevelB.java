package Com.Inheritance;

public class MultiLevelB extends MultiLevelA{

	
	
	
	public void method2() {
		
		System.out.println("i am from parent");
	}
	
	
	 public static void main(String[] args) {
		
		 MultiLevelB obj=new MultiLevelB();
		 obj.method1();
		 obj.method2();
	}
	
}
