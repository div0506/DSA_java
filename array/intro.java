import java.util.*;

public class intro {
    public static void main(String[] args)
    {
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("Physics"+marks[0]);
        System.out.println("Maths"+marks[1]);

    }
    
}
