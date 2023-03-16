class First
{
	static void m1(float a)
	{
		System.out.println(a);
	}
}
class Second
{
	static void m2(float b)
	{
		System.out.println(b);
	}
}
class Demo4
{
	static float y=100.5f;
	public static void main(String[] args)
	{
		int a=100;
		System.out.println("Start");
		float result=y+a;
		First.m1(result);
		Second.m2(result);
		System.out.println("Stop");
	}
}