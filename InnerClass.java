class A
{
     public void show()
     {
        System.out.println("In a show");
     }
     static class B
     {
          public void morog()
          {
            System.out.println("In B show");
          }
     }
}

public class InnerClass 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.morog();
    }
}
