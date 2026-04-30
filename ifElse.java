class ifElse{
    public static void main(String[] args){
        //lets check if number is divisible by both 3 and 5
    int num = 0;
    
    if(num == 0){
        System.out.println("Num : " + num + " is 0");
    }
    else if(num % 3 == 0 && num % 5 == 0){
        System.out.println(num + " is divisible by both 3 and 5");
    }
    else{
        System.out.println("Num : " + num + " is not divisible by 3 or 5 and is not 0");

    }
    }
}