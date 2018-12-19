import java.util.Scanner
class P13
{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in)
		String s=sc.nextline();
		int L=(int)(s.length());
		String s1=s.substring(L/2);
		System.out.println("Half of String are:" + s1 +"and length="+L);
		
		
	} 
}