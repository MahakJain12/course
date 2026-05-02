class stringBuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        System.out.println(sb.append("M"));
        System.out.println(sb.delete(2,4));
        System.out.println(sb.substring(2));
        sb.setLength(3);
        String str = sb.toString();
        System.out.println(str);

    }
}