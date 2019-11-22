
public class Student {
		String name;
		int rollNo;
		long phoneNo;
		String gmail;
		String branch;
		
	public Student(String name, int rollNo, long phoneNo, String gmail, String branch) {
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
		this.gmail = gmail;
		this.branch = branch;
	}
	
	void display() {
		System.out.println("Name: "+name+ " RollNo: "+rollNo+" PhoneNo: "+phoneNo+ " Gmail: "+gmail+" Branch: "+branch);
	}

	public static void main(String[] args) {
		Student s1 = new Student("gokul", 101, 894019184, "gokulsmart23@gmail.com", "Btm" );
		Student s2 = new Student("kavin", 102, 987437323, "kavinrock@gmail.com", "Btm");
		Student s3 = new Student("suman", 103, 997666655, "sumankulli@gmail.com", "Basavanagudi");
		Student s4 = new Student("mohan", 104, 946373902, "mohanak19972gmail.com", "Btm");
		Student s5 = new Student("keerthana", 105, 939329833, "keerthanareddy@gmail.com", "Rajaji nagar");
		Student s6 = new Student("ajay", 106, 962323121, "ajaykumar@gmail.com", "Btm");
		Student s7 = new Student("devaraj", 107, 934532423, "devaraj@gmail.com", "Basavanagudi");
		Student s8 = new Student("sathish", 108, 933424344, "sathish@gmail.com", "Btm");
		Student s9 = new Student("sasi",109, 934325554,"sasikumar@gmail.com", "Btm");
		Student s10 = new Student("suraj", 110, 934334324, "surajbnglr@gmail.com", "Basavanagudi");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s7.display();
		s8.display();
		s9.display();
		s10.display();
		
	}

}
