
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

class Divide {
        int i = 0;
        int j = 10;

        int nums[] = new int[5];

        public void show() throws CustomException{
            try{
                System.out.println(nums[5]);
            }
            catch(Exception e){
            //it is throwing a custom exception
            throw new CustomException("This is custom exception");
            }
        }

        public void showEx(){
            try{
                show();
            }
            catch(CustomException e){
                System.out.println(e.getMessage());
            }
        }

        public void divideEx() throws Exception{
            i=j/i;
        }

        public void divide(){
        try{
            divideEx();
         }
         catch(Exception e){
            System.out.println("It cannot be divided by 0 : "+e.getMessage());
         }
         }
}
public class TryCatch{
    public static void main(String[] args) {
        Divide obj = new Divide();
        obj.divide();
        obj.showEx();;
    }
}