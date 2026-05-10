class Apple{
    int a;
     public void show(){
            System.out.println(a);
     }
    class Ball{
        int b;
        public void show(){
            System.out.println(b);
        }
    }
}

public class InnerClass{
    public static void main(String[] args){
        Apple obj = new Apple();
        obj.a = 10;
        obj.show();

        Apple.Ball obj1 = obj.new Ball();
        obj1.b=20;
        obj1.show();


        //anonymous inner class
        Apple obj3 = new Apple(){
            public void show(){
                System.out.println("I am anonymous inner class");
                              }
           };
        obj3.show();
    }
    
}


