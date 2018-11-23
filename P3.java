public class P3
{
    public static void main(String[] args)
   {
	float inc=1500,tax,rs;
	int taxrs,taxpaise;
	tax=(float)(inc*0.35);
                  System.out.println("Tax in dollars"+tax); 
	rs=(float)(tax*71.25);
	taxrs=(int)(rs);
	System.out.println("Tax in Rs" + taxrs);
	taxpaise=(int)((rs-taxrs)*100);
	System.out.println("Tax in paise" + taxpaise);
                 
   } 
}