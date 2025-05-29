import java.util.*;
public class optimized_p {
    public static boolean isprime(int n)
    {
        for (int i=1;i<Math.sqrt(n);i++)
        {
            if (i==2){return true;}
            if (i%n==0){return false;}

        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int n = sc.nextInt();

        System.out.print(isprime(n));
        sc.close();
     

    }
    
}
