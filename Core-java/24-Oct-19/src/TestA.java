
public class TestA {
	
	static int a;
	int b;
	static {
		a = 10;
		System.out.println("static block 1");
	}
	
	static {
		a = 20;
		System.out.println("static block 2");
	}
	
	
	TestA() {
		System.out.println("TestA() constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println("a value "+a);
		System.out.println("main end");
	}
	
	static {
		a= 40;
		System.out.println("static block 3");
	}

}
