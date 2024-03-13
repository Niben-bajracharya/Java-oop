class PersonMethod{
    String name="Ram";

    public void display() {
        System.out.println("This is the superclass");
    }
}

class EmployeeMethod extends PersonMethod{
    String name ="Peter";

    public void display(){
        System.out.println("Subclass name:" + name);
    }

    public void finalDisplay() {
        super.display();
    }
}
public class employee{
    public static void main(String args[]){
        EmployeeMethod e = new EmployeeMethod();
        e.display();
        e.finalDisplay();
    }
}