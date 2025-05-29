import java.util.*; 
public class product {

    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a= sc.nextInt();
         System.out.println("Enter the second number ");
        int b = sc.nextInt();

        int result = mul(a,b);
        System.out.println("product of numbers is  " +result);
    }

    
}
