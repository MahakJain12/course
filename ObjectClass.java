class Laptop{
    String model;
    int cost;

    public boolean equals(Laptop Lap2){
        
        if(this.model==Lap2.model&&this.cost==Lap2.cost){
            return true;
        }
        return false;
    }



}

class ObjectClass{
    public static void main(String[] args){
        Laptop Lap1 = new Laptop();
        Lap1.model="dell";
        Lap1.cost=1000;
        Laptop Lap2 = new Laptop();
        Lap2.model ="dell";
        Lap2.cost=1000;
        boolean isLapSame = Lap1.equals(Lap2);
        System.out.print(Lap1);
        System.out.print(Lap2);
        System.out.print(isLapSame);
    }
}