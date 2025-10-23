class Calculator
{
        int r;
          
         public int add (int a,int b)

         {
            r=a+b;
            return r;
         }
}

public class Class 
{  
     public static void main(String a[])
      {
          int num1=5;
          int num2=7;

        Calculator calc = new Calculator();
             
            int result = calc.add(num1,num2);

            System.out.print(result);

      }
    
}
