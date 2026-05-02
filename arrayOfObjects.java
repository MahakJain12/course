class Student{
    int rollno;
    int marks;
    String name;
}




class arrayOfObjects{
     public static void main(String[] args){
        Student s[] = new Student[3];
        
        s[0] = new Student();
        s[0].name="mahak";
        s[0].marks=94;
        s[0].rollno=1;

        s[1] = new Student();
        s[1].name="vipul";
        s[1].marks=90;
        s[1].rollno=2;

        s[2] = new Student();
        s[2].name="raju";
        s[2].marks=100;
        s[2].rollno=3;

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].name +" " +s[i].rollno + " "+ s[i].marks);

        }
     }
}