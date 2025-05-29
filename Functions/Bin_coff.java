import java.util.*;
public class Bin_coff 
{
    public static long Binomial(long n, long r)
    {
        long a = fact.factorial(n);
        long b=  fact.factorial(r);
        long c= fact.factorial(n-r);
        return a/(b*c);
        
    }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number :");
      long n = sc.nextInt();

      System.out.print("Enter the second number :");
       long r = sc.nextInt();
       long answer = Binomial(n,r);
       System.out.print("The required binomial coffeicient is "+answer);
       sc.close();
  }
}
