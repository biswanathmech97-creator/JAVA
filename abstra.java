abstract class A
{
   public abstract void drive();

   public void gana()
   {
    System.out.print("In gana show");
   }
}

class B extends A
{
    public void drive()
    {
      System.out.print("In drive show");
    }
}

public class abstra 
{
    public static void main(String args[])
    {
        A obj = new B();
        obj.drive();
        obj.gana();
    }
}
