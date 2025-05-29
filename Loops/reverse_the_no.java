import java.util.*;

public class reverse_the_no {
    public static void main(String[] args) {
        int reverse = 0; // Initialize reverse to 0
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
