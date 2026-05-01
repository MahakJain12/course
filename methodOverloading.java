class perimeter {
    public int sum(int num1){
        return(4*num1);
    }
    public int sum(int num1, int num2){
        return(2*(num1+num2));
    }
}

class methodOverloading{
    public static void main(String [] args){
       perimeter peri = new perimeter();
        int sq = peri.sum(5);
        int rt = peri.sum(5,10);
        System.out.println("square : " + sq);
        System.out.println("rectangle : " +rt);
    }
}