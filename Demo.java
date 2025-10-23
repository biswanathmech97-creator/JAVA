class Computer
{
    public void Bishakha()
    {

        System.out.print("Music");

    }    

    public String Anindya(int cost)
 
    {
        if (cost>=23)
            return "A";
        else 
            return "nothing";    
    }

}
public class Demo
{
      public static void main (String args[])

 {   
  
  int i=56;
      
     Computer my= new Computer();
        my.Bishakha();
     String str= my.Anindya(i);  
        System.out.print (str);

 }       
         
}

    
