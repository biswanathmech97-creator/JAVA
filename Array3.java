class Student
{
    static int roll ;  // static
    String name;

    public void result()
    {
        System.out.println(roll + ":" + name);
    }
}
public class Array3 
{
    public static void main (String a[])
    {
    Student s1 = new Student();
    s1.roll =1;
    s1.name ="Rima";
 
    Student s2 = new Student();
    s2.roll =2;
    s2.name ="Shila";

    Student s3 = new Student();
    s3.roll =3;
    s3.name = "Nita";                                                  //ARRAY STUDENT APLICATION
        
    s1.roll=6;
  
    //Student students[] = new Student[3];
    //students[0]=s1;
    //students[1]=s2;
    //students[2]=s3;

    //for(Student stu : students )
    //{
        //System.out.println(stu.name + ":" + stu.roll);
    //}

    s1.result();
    s2.result();
    s3.result();
}
}
