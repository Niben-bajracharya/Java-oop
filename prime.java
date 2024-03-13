// program to check if the number is prime or not
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int flag=0;

        if(n<=1){
            System.out.println(n+ " is not a prime number");
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n +" is not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n+" is a prime number");
            }
        }
    }
}