class Demo
{
static int x=200;
static float m1()
	{
	System.out.println("Inside Method m1");
	float b=200.5f;
	float result=x+b;
	return result;

	}
}
class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		float res=Demo.m1();
		System.out.println(res);
		System.out.println("Stop");
	}
}