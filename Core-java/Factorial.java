class Factorial 
{
	public static void main(String[] args) 
	{
		int num = 5;
		int res = calcFact(num);
		System.out.println(res);
	}

	static int calcFact(int n)
	{
		int fact = 1;
		for (int i=1;i<=n ;i++ )
		{
			fact = fact*i;
		}
		return fact;
	}
}
