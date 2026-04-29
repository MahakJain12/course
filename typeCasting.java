class typeCasting{
    public static void main(String[] args){
        byte a = 127;
        int b = 19;
        byte c = (byte)b;
        int d = 258;
        byte e = (byte)d;
        System.out.println(c);
        System.out.println(e);// 258 % 256 = 2
    }
}