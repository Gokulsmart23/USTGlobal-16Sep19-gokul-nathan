class Circumference 
{
	public static void main(String[] args) 
	{
		int radius = 100;
		double res = calcCircum(radius);
		System.out.println(res);
	}

	static double calcCircum(int r)
	{
		double circum = 2*22/7*(r);
		return circum;
	}
}
