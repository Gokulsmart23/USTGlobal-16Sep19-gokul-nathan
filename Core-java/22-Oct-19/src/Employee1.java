
public class Employee1 {
	String name;
	int eid;
	
	public Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	void sayHello( ) {
		System.out.println("Hello "+name+" welcome to UST Global company");
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("rashmika", 143);
		e1.printDetails();
		Employee1 e2 = new Employee1("manasi", 420);
		e2.printDetails();
		Employee1 e3 = new Employee1("chacha", 69);
		e3.printDetails();
		e1.sayHello();
		e2.sayHello();
		e3.sayHello();
	}

}
