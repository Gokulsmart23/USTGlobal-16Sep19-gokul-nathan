
public class Test {

	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "black";
		p.brand = "cello";
		System.out.println("Cost is "+p.cost);
		System.out.println("Color is "+p.color);
		System.out.println("Brand is "+p.brand);

		p.write();
		System.out.println("*********************************************************");
		Van v = new Van();
		v.color = "white";
		v.cost = 10000;
		System.out.println("Van cost is "+v.cost);
		System.out.println("Van color is "+v.color);
		v.move();
		
		Van v1 = new Van();
		v1.color = "pink";
		v1.cost = 12000;
		System.out.println("Van cost is "+v1.cost);
		System.out.println("Van color is "+v1.color);
		v1.move();
	}
}
