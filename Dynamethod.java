class A
{
    public void show()
    {
        System.out.println("In a show");
    }
}
class B extends A
{
    public void show()
    {
        
    }
}

public class Dynamethod 
{
    public static void main(String args[])
    {
        A obj= new B();
        obj.show();
    }
}
