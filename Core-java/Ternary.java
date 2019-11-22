class Ternary  
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int max = (a>b && a>c)? a : (b>c)?b :c;
		System.out.println(max);
	}
}
