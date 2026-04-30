class palindromeUsingIfElse{
    public static void main (String[] args){
    int num = 121;
   int first = num/100;
   int last = num % 10;
    if(first==last){
        System.out.println("it is palindrome");
    }
        else{
            System.out.println("it is not palindrome number");
        }
    }
}

//when divide we get left digits 
//when modulus we get right digits 
//120/10 = 12
//120%10 = 0
//12/10 =1
//12%10=0

//120/100 = 1
//120%100=20

//first digit = 120/100 = 1
//last digit = 120%10 = 0