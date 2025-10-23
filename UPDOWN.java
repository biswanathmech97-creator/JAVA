class A
{
     public void show()
     {
        System.out.println("In a show");
     }
}
class B extends A
{
    public void show1()
    {
        System.out.println("In B show");
    }
}

public class UPDOWN 
{
    public static void main(String args[])
    {
     A obj1=(A) new B();
     obj1.show();

     B obj2=(B) obj1;
     obj2.show1();
    }

}
