import java.util.Scanner;
public class BtoD 
{
    public static int bin_to_dec(int n)
    {
        String s = String.valueOf(n); 
        int size = s.length();
        int pow = size - 1;
        int sum = 0;
        for(int i=0;i< size; i++){
           char d = s.charAt(i);                  
            int digit = Character.getNumericValue(d);
            sum += digit * (int) Math.pow(2, pow);
            pow -- ;
        }
        return sum;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the binary number :");
        int n = sc.nextInt();
        System.out.print(bin_to_dec(n));
        sc.close();
    }    
}
