interface A
{
      int age = 33;
      String state = "Delhi";
      void show();
      void manha();
}

class B implements  A
{
        public void show()
        {
            System.out.println("In show");
        }
        public void manha()
        {
            System. out.println("In config");
        }
}

public class interf 
{
    public static void main(String args[])
    {
        A obj;
        obj=new B();
        obj.show();
        obj.manha();

        

        System.out.println(A.state);
    }
}
