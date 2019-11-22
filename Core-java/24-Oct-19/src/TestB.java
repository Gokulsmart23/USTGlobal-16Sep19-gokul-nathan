
public class TestB {
	
	int a;
	static int b;
	
	{
		a = 10; 
		b = 20;
		System.out.println("non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		TestB b = new TestB();
		TestB b1 = new TestB();
		System.out.println();
		System.out.println("main end");
	}
	
	{
		System.out.println("non static block 2");
	}
}
