
public class TestB {
	
	static int a = 25;
	int x;
	
	public static void add() {
		// only final and non-static will accepted by the local variables
		final int a = 10;
		System.out.println(a);
		int b = 20;
		System.out.println(b);
	}

	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println("x value is "+t.x);
	}

}
