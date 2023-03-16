abstract class Sample
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 method "+a);
	}
}
class Demo8 extends Sample
{
	public static void main(String[] args)
	{
		Sample s=new Demo8();
		s.m1();
	}
}