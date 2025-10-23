enum Status
{
    RECYLING, MAKEUP,MASHCARA,LIPSTICK,APPLE;
}

public class EnUmm 
{
    public static void main(String args[])
    {

        Status s = Status.MAKEUP;

        switch(s)
        {
            case MAKEUP:
               System.out.print("Good");
               break;
            case MASHCARA:
               System.out.print("Not bad");
               break;
             default:
                System.out.print("Vry Good");
                break;


        }
        //if(s==Status.MASHCARA)
//      {
            //System.out.print("Good");
        //}
        //else if(s== Status.LIPSTICK)
        //{
            //System.out.print("Bad");
        //}
        //else
        //{
            //System.out.print("Not Good");
        //}






        
        //Status[] ss = Status. values();
       // for(Status s : ss)
        //{
           // System.out.println(s);
        //}
        
        
    }
}
