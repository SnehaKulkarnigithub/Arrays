class First
{
	static int x=200;
}
class Second
{
	static void m1()
	{
		System.out.println("Inside Method m1");
	}
}
class Demo3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(First.x);
		Second.m1();
		System.out.println("Stop");
	}
}