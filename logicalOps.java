class logicalOps{
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        char a = 'a';
        char b = 'b';
        boolean result = (x>y) || (a>b);
        boolean result2 =(a=5)<(b = 10)&& (x<y);// java promotes char to int before comparison
        System.out.println(result);
        System.out.println(result2);
    }}