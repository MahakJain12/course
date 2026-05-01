class calculator{
    
int num1;
int num2;

//methods
public int add(int num1, int num2){
    return(num1+num2);
}
}



//main function
class classConcept{
    public static void main(String[] args){
      //create object
       calculator calc = new calculator();
       int result = calc.add(1,2);
       System.out.println(result);
    }

}