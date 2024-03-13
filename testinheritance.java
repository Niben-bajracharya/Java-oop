class animal{
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends animal{
    void sleep(){
        System.out.println("sleeping...");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class testinheritance{
    public static void main(String[] args){
        cat c=new cat();
        c.meow();
        c.eat();
    }
}