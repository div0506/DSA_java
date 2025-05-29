import java.util.*;
public class p_in_range 
{
    public static void print_prime(int n)
    {
        int i;
        for( i=2;i<n;i++)
        {
            if(prime_no.prime(i))
            {
               System.out.print(i); 
            }
        }
        
    
    }

    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the range :");
      int n = sc.nextInt();
      
      print_prime(n);
      sc.close();
    }
    
}
