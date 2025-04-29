public class Max_num
{

	public static void max(int a , int b , int c)
	{
		
		if ((a>b)&(a>c))
		{ System.out.println("a is max of three numbers");}
		if ((b>a)&(b>c))
		{ System.out.println("b is max of three numbers");}
		else
		{ System.out.println("c is max of three numbers");}

	}
	public static void main(String[] args)


	{	
		max(3,4,5);
        }
}