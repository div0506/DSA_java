import java.util.*;
public class sum_of_n_number {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int count =1;
        while(count<=n)
        {
            sum= sum+count;  
            
            count++;
        }
        System.out.println(sum);
    }
    
}
