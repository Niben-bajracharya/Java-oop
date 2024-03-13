public class exception{
    public static void main(String[] args){
        try{
            // code break1
            int[] numbers={1,2,3,4,5,6};
            System.out.println(numbers[10]); //Accessing an index out of bounds    
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: Array index out of bounds");
        }
        try{
            //code block 2
            String str=null;
            System.out.println(str.length()); //trying to invoke a method on null object
        }
        catch(NullPointerException e){
            System.out.println("Exception caught: Null pointer exception");
        }
    }
}