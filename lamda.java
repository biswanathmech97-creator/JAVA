
@FunctionalInterface
interface A
{
      int salma(int i, int j);
}

public class lamda 
{
    public static void main(String args[])
    {
    A obj=(i,j)->i+j;

    int result= obj.salma(3, 5);
    System.out.print(result);

    
    }
}
