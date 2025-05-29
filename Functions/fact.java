import java.util.*;
public class fact 
{int n;

  public static long factorial(long n)
  { long f = 1;
    for(int i=1;i<=n;i++)
    f= f*i;
    return f;
  }
  public static void main(String[] args)  
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    long n = sc.nextInt();

    long result =  factorial(n);
    System.out.println("Required factorial is " +result);
  }
}                                       
