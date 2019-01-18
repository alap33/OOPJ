 
package oopj25;
class DivideZeroException extends Exception
{
    int i;
    DivideZeroException(String s,int it){
        super(s);
        i=it;
    }
    public int getIteration()
    {
        return i;
    }
    
}

public class P25 {
 public static void loop()throws DivideZeroException
 {
     int i=0,d;
     double div;
     try
     {
         for(i=0;;i++)
         {
             d=(int)((Math.random())*100);
             div=10/d;
         }
     }
     catch(ArithmeticException e)
     {
         throw new DivideZeroException("Divide By Zero",i);
     }
         
 }
    public static void main(String[] args){
        int i=0;
        try
        {
            loop();
        }
        catch(DivideZeroException e)
        {
            System.out.println("Inside main function");
            System.out.println(e.getMessage());
            i=e.getIteration();
           
            
        }
   
finally
{
  System.out.println("Iteration :"+i);
}
    
}
}   

 