class A extends Object{
   public A(){
        System.out.println("in A constructor");
    }

    public A(int n){
        System.out.println("in A int paramaterized constructor");
    }

    public A(int n, int m){
        System.out.println("in A int m,n paramaterized constructor");
    }
    }

class B extends A{
    
    public B(){
        super();
        System.out.println("in B constructor");
    }

    public B(int n){
        super(n);
        System.out.println("in B int paramaterized constructor");
    }

    public B(int n, int m){
         this();
        System.out.println("in B int m,n paramaterized constructor");
    }

}

class ThisAndSuper{
    public static void main(String[] args) {
        B obj = new B(10,20);
    }
}