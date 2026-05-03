class Human{
    int age;
    String name;

    public Human(){
        System.out.println("it is default constructor");    
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Human(String name){
        this.name=name;
    }
}
class Constructors{
    public static void main(String[] args){
        Human obj = new Human();
        Human obj1 = new Human("Mahak");
        Human obj2 = new Human(27,"Mahak");
        System.out.println(obj.name + " " + obj.age);
        System.out.println(obj1.name + " " + obj1.age);
        System.out.println(obj2.name + " " + obj2.age);
    }
}