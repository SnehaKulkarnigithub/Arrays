class Sample1
{
	static int m2(int a)
	{
		return a+100;
	}
}
class Sample2
{
	static float m1(float b)
	{
		return b+200.5f;
	}
}
class Demo5
{
	static int x;
	static float y;
	public static void main(String[] args)
	{
		int a=100;
		float b=200.5f;
		System.out.println("Start");
		x=Sample1.m2(a);
		y=Sample2.m1(b);
		System.out.println(x);
		System.out.println(y);
		System.out.println("Stop");


	}
}