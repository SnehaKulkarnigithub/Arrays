class Outer1
{
	int a=100;
	class Inner1
	{
		float b=200.5f;
	}
	public static void main(String[] args)
	{
		System.out.println("Inside main");
		Outer1 o1=new Outer1();
		System.out.println(o1.a);
		Outer1.Inner1 i1=o1.new Inner1();
		System.out.println(i1.b);
	}
}