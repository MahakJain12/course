class calculator {
    public int sum(int num1){
        return(4*num1);
    }
    public int sum(int num1, int num2){
        return(2*(num1+num2));
    }
}

class methodOverloading{
    public static void main(String [] args){
       calculator calc = new calculator();
        int sq = calc.sum(5);
        int rt = calc.sum(5,10);
        System.out.println("square : " + sq);
        System.out.println("rectangle : " +rt);
    }
}