class Outer1
{
	int a=100;
	static float b=200.5f;
	class Inner1
	{
		void m1()
		{
			System.out.println("Inside m1 method");
			System.out.println(new Outer1().a);
			System.out.println(b);
		}
	}
	
}
class Sample1
{
	public static void main(String[] args)
	{
		Outer1.Inner1 i=new Outer1().new Inner1();
		i.m1();
	}
}