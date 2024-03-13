import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a");
        int a = sc.nextInt();
        System.out.println("Enter value for b");
        int b = sc.nextInt();
        System.out.println("Sum of a + b = " + (a+b));

    }
}