class Fly
{
    public Fly()
    {
        System.out.println("Default is created");
    }
    
    public void show()
    {
        System.out.println("Function is created");
    }
}

public class Anonnymous 
{
    public static void main(String args[])
    {
        new Fly().show();
    }
}
