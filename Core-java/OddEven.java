class OddEven 
{
	public static void main(String[] args) 
	{
		int n = 100;
		boolean b = oddEven(n);
		System.out.println("Is the number is Even "+b);
	}
	static boolean oddEven(int number)
	{
		if (number%2 == 0)
		{
			return true;
		} else {
			return false;
		}
	}
}
