class Factorial  
{
	public static void main(String[] args) 
	{
		
		int i = 1;
		int factorial = 1;
		while (i<=5)
		{
			factorial *= i;
			i++;				
		}
		System.out.println(factorial);
	}
}
