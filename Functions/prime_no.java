import java.util.*;
public class prime_no{
    public static boolean prime(int n)
    {
        int count = 0;
        for(int i=1;i*i<=n;i++){
      if (n%i==0)
      {
        count += 2;
      }
      if (count > 2){
        return false;
      }
      }
      return true;
      
    }
      
    
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      System.out.print(prime(n));
      sc.close();
    }
}

