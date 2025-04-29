import java.util.*;
public class IsPrime
{

	public static int IsPrime(int n)
	{
		if(n==1)
		{
			return -1;
		}
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
			{ 
				return -1;
			}
		}
		return 1;
	}



	public static void main (String[] args)

	{
		int result;
		int n = 142;
		result = IsPrime(n);
		if(result==1){System.out.println(n + " is Prime number ");}
		else{System.out.println(n + " is not Prime number ");}
		
	}
}