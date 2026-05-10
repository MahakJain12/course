abstract class Car{
    public abstract void drive();
    public abstract void fly();
}

abstract class WagonR extends Car{
    
    public void drive(){
        System.out.println("I can drive");
    }
}
class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("I can fly");
    }
}

public class AbstractClass{
    public static void main (String[] args){
        UpdatedWagonR obj1 = new UpdatedWagonR();
        obj1.fly();
        obj1.drive();
    }
}