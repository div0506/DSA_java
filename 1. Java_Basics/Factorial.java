public class Factorial
{

	public static void fact(int n)
	{
		int ans = 1;
		for(int i=n; i>0; i--)
		{
			ans = ans * i;
		}
		System.out.print("factorial of " + n + " is " + ans);
	}



	public static void main (String[] args)

	{
		fact(5);
	}
}