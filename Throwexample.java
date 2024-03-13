public class Throwexample{
    public static void main(String[] args){
        try{
            int result = divide(10,0);
            System.out.println("Result of division:"+ result);
        }
        catch(ArithmeticException e){
            System.out.println(("Exception caught: Division by zero"));
        }
    }
    public static int divide(int dividend, int divisor){
        if(divisor==0){
            throw new ArithmeticException("Division by zero");
        }
        return dividend/divisor;
    }
}