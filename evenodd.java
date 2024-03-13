import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a positive number: ");
        int a = scan.nextInt();

        String b = (a % 2 ==0) ? "even" : "odd";
        System.out.println(a + " is a " + b + " number");
    }
}