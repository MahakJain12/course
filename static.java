class mobile{

    static String name;
    String model;
    int cost;

    static{
        name = "Nokia";
        System.out.println("in static block : name of mobile : "+name);
    }

    static void show(){
        System.out.println(name);
    }

    void show1(){
        System.out.println(name+" "+cost+" "+model);
    }
}

class staticOps{
    public static void main(String[] args){
        mobile obj = new mobile();
        mobile.show();
        obj.model = "ABC";
        obj.cost = 1000;
        obj.show1();
        mobile.name="sony";
        obj.show1();
    }
}