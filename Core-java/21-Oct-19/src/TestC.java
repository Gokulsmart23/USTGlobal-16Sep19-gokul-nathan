
public class TestC {

	public static void main(String[] args) {
		Person.color = "white";
		Person.sleep();
		System.out.println("Person color "+Person.color);
		
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "gokul";
		System.out.println("Person p1 age "+p1.age);
		System.out.println("Person p1 name "+p1.name);
		p1.color = "black"; //  Not a Good practice
		p1.sleep();
		System.out.println("*******************************************");
		Person p2 = new Person();
		p2.name = "mohan";
		p2.age = 22;
		System.out.println("Person p2 age "+p2.age);
		System.out.println("Person p2 name "+p2.name);
	}
	
}
