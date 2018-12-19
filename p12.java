import java.util.Scanner
class P12
{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in)
		String s=sc.nextline();
		int L=(int)(s.length());
		int vc=0,cc=0;
		for(int i=0;i<L;i++)
		{
			char c=s.charAt(i)
			if(c="a" || c="u" ||c="o" ||c="i" ||c="u"||
			   c="A" || c="E" ||c="O" ||c="I" ||c="U")
			{
			  vc++;

			}
			else
			{
			cc++;
			}
			System.out.println("no.of vowels of Strings are:" +vc);
			System.out.println("no.of consonants of String Are:" +cc);
			
		}
	} 
}