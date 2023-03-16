class Outer1
{
	void m1()
	{
		System.out.println("Inside m1 method");
		class Inner1
		{
			int a=100;
		}
		Inner1 i1=new Inner1();
		System.out.println(i1.a);
	}
}
public class Sample1
{
	public static void main(String[] args)
	{
		Outer1 o=new Outer1();
		o.m1();
	}
}