
public class Toyota implements AutoMobile, AutoMobileWithAbs{

	@Override
	public int gear() {
		System.out.println("gear() method of toyota");
		return 20;
	}

	@Override
	public void gps() {
		System.out.println("gps() method of toyota");
	}

	@Override
	public void abs() {
		System.out.println("abs() of toyota");
	}

}
