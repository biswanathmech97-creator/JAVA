class A
{
    
    public A()
    {
        
         System.out.println("In a");
    }

    public A( int a )
    {
        
         System.out.println("In A int");
    }
}

class B extends A
{
   
    public B()
    {
        
        System.out.println("In b");
    }

    public B( int b)
    {
        
        System.out.println("In b int");
    }
}

public class Inheritance 
{
    public static void main(String args[])
    {
        B obj= new B();
    }
}
