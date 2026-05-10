class C{
    public void show(){
        System.out.println("I am C method");
    }

    public void config(){
        System.out.println("This is common method");
    }
}

class D extends C{
    public void show(){
        System.out.println("I am D method");
    }
}

class MethodOverriding{
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.config();
    }
}