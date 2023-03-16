class First
{
	static int x=300;
}
class Second
{
	static void m1()
	{
		System.out.println("Inside Method");
		System.out.println(First.x+Demo2.y);
	}
}
class Demo2
{
	static float y=300.5f;
	public static void main(String[] args)
	{
		System.out.println("Start");
		Second.m1();
		System.out.println("Stop");
		
	}
}