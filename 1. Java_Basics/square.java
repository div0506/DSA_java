import java.util.*;
public class square
{
	static int sq(int n)
	{
		return n*n;
	}


	public static void main(String[] args)

	{
		System.out.println("Please enter the no. you want square of : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.print("square of " + n + " is " + sq(n));
	}
}