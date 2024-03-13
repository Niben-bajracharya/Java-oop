interface Walkable{
    void walk();
}

interface Swimmable{
    void swin();
}
class Human implements Walkable, Swimmable{
    public void walk(){
        System.out.println("Human is walking");
    }
public void swin(){
    System.out.println("Human is swimming");
    }
}
public class testinterface{
    public static void main(String args[]){
        Human human = new Human();
        human.walk();
        human.swin();
    }
}  