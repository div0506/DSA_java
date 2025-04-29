public class pattern6
{
	public static void main(String[] args)
	{
		for(int i=0;i<4;i++)
			{
				for(int j=-1;j<i;j++)
					{
					System.out.print(j+2);
					
					}
				for(int k=6; k>(2*i); k--)
					{
					System.out.print(" ");
					}
				for(int l=1; l>(i); l--)
					{
					System.out.print(l);
					}
					System.out.println();
			}

	}
}