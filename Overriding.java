class A
{
     public void show()
     {
        System.out.println("A show");
     }
     public void config()
     {
        System.out.println("Config show");
     }
}

class B extends A
{
    public void show1()
    {
        System.out.println("A show");
    }
}

public class Overriding 
{
    public static void main()
    {
        B obj= new B();
        obj.show1();
        obj.config();
    }
}
