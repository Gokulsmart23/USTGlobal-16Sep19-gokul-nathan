class Area 
{
	public static void main(String[] args) 
	{
		int radius = 100;
		double res = calculateArea(radius);
		System.out.println(res);
	}
	static double calculateArea(int r)
	{
		double area = 22/7*(r*r);
		return area;
	}
}
