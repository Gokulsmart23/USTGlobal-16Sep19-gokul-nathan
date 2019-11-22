class BMI 
{
	public static void main(String[] args) 
	{
		double height = 1.7;
		int weight = 65;
		double bmi = weight/(height*height);
		System.out.println(bmi);
		if (bmi>40)
		{
			System.out.println("You're in out of range");
		}
		else if (bmi>=30 && bmi<=39.9)
		{
			System.out.println("You're in the obese range");
		}
		else if (bmi>=25 && bmi<=29.9)
		{
			System.out.println("You're in the overweight range");
		}
		else if (bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("You're in the healthy weight range");
		}
		else if (bmi<18.5)
		{
			System.out.println("You're in underweight range");
		}	
	}
}
