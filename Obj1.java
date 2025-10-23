class Roman
{
    int r;
       
        public int add(int a,int b)
    {
        r= a+b;
        return r;
    }
        public int add1(int a,int b,int c)
    {
        int y= a+b+c;
        return y;
    } 
       public double add2(double a,double b)
    {
        double d= a+b;
        return d;
    }   
        
}

public class Obj1 
{
     public static void main (String args[])
{
    int num1=5;
    int num2=8;
    int num3=4;
    double x=4.4;
    double y=5.5; 
    Roman roy = new Roman();
     int result1 = roy.add1(num1,num2,num3);
    System.out.println(result1);
    double result2 = roy. add2(x,y);
    System.out.println(result2);
}  

}
