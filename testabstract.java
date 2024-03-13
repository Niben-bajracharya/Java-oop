abstract class phone{
    phone() {
        System.out.println("My Phone");
    }
    abstract void call();
}

class Nokia extends phone{
    void call(){
        System.out.println("Nokia is calling");
    }
}
class Samsung extends phone{
    void call(){
        System.out.println("Samsung is calling");
    }
}

class testabstract{
    public static void main(String args[]){
        Nokia obj= new Nokia();
        obj.call();
        System.out.println();
        
        Samsung sg= new Samsung();
        sg.call();
        System.out.println();
    }
    
}

