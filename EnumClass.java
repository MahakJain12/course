enum LaptopNew{
    MACBOOK(2000),DELL(400),HP(600);

    LaptopNew(int price) {
        this.price = price;
    }
    private int price;

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}

public class EnumClass{
    public static void main(String[] args){
        LaptopNew.HP.setPrice(1200);
        LaptopNew[] laps = LaptopNew.values();
    for(LaptopNew l:laps){
        System.out.println(l+":"+l.getPrice());
    }
    }
}