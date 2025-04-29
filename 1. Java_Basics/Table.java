import java.util.*;
public class Table

{
	public static void table(int n )
	{	
		for(int i=1;i<11;i++)
		{
			System.out.println(n + " x " + i + " = " + n*i);
		}

	}
	public static void main(String[] args)

	{
		System.out.println("Please enter the no. you want table of : ");
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		table(n);
	}
}