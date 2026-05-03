class Calc{
    public int add(int a, int b){
        return a+b;
    }

    public int sub (int c, int d){
        return (c-d);
    }
}

class AdvCalc extends Calc{
    public int multiply(int a , int b){
        return a*b;
    }

    public int divide(int c, int d){
        return c/d;
    }
}

class VeryAdvCalc extends AdvCalc{
    public int power(int a){
    return Math.powExact(a, 2);
    }
}
class Inheritance{
    public static void main(String [] args){
        Calc obj1 = new Calc();
        AdvCalc obj2 = new AdvCalc();
        VeryAdvCalc obj3 = new VeryAdvCalc();
        System.out.println(obj1.add(2,2) + " "+obj1.sub(2,2));
        System.out.println(obj2.add(3,3) + " "+obj2.sub(3,3) + " "+obj2.multiply(3,3)+" "+obj2.divide(6,2));
        System.out.println(obj3.add(4,4) + " "+obj3.sub(4,1) + " "+obj3.multiply(4,4)+" "+obj2.divide(8,2));
    }
}