interface AA{
    //by default public abstract
    void show();
    void config();
}

interface BB extends AA{
    void fly();
    }
    
class CC implements BB{
    public void show(){
        System.out.println("I am show");
    }
    public void config(){
         System.out.println("I am config");
    }
    public void fly(){
        System.out.println("I am fly");
    }
}

public class Interface{
    public static void main(String[] args){
        CC obj = new CC();
        obj.show();
        obj.config();
        obj.fly();
    }
}