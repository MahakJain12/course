class typeCasting{
    public static void main(String[] args){
        byte a = 127;
        int b = 19;
        byte c = (byte)b;
        int d = 258;
        byte e = (byte)d;
        float f = 9.6f;
        int g = (int)f;
        System.out.println(c);
        System.out.println(e);// 258 % 256 = 2
        System.out.println(g);// 9.6 -> 9
    }
}