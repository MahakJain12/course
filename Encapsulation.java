class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Encapsulation{ 
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Mahak");
        obj.setAge(28);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}