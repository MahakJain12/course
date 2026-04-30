class basicForLoopPrograms{
    public static void main(String [] args){
    //even and odd and sum of numbers between 1 to 10
    int sum = 0;
    for(int i=1; i<=10; i++){
        sum = sum+i;
        if(i%2==0){
            System.out.println("Even number is "+i);
        }
        else{
            System.out.println("odd number is " +i);
        }
        System.out.println("Sum is " + sum);
    }
 System.out.println("Final sum is " + sum);
    }
}