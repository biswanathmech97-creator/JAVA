@FunctionalInterface
interface A
{
      void salma();
}

//class B implements A
//{
    //public void salma()
    //{
        //System.out.println("I am Mukta");
   // }
//}

public class Funcinter 
{
    public static void main(String args[])
    {
    A obj=new A()
    {
    public void salma()
    {
        System.out.print("I am farah");
    }
    };
    obj.salma();
    }
}
