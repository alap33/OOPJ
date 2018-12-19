class P11
{
	public static void main(String a[])
	{
	String[] mon={"january","february","March","April","May","June","July","August","September","October","November","December"}
	int i;
	double sum=0.0;
	double n[]=new double[12];
	for(i=0;i<12;i++)
	 {
		n[i]=(100.00*Math.random());
		System.out.println("In Month" + mon[i] + " number is "+n[i]);
		sum=sum+n[i];	
	 }
System.out.println("Sum=" + sum);
System.out.println("Average="+(sum/12));
	}
}