class Sample1
{
	private int var1;
	
	Sample1 (int v,float c)
	{
		float a=v+c;
	   System.out.println(a);
}
	Sample1 (float v,int c)
	{
float s=v+c;
	   System.out.println(s);
}
}

public class Six
{ 
	public static void main(String args[])
{
	Sample1 s1=new Sample1(5,6.8756f);
	Sample1 s2=new Sample1(6.00078f,10);
		

}}		 