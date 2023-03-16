class Demo
{
	static int x;
	static void m1(int a)
	{
		System.out.println("Inside Method m1");
		x=a;
		System.out.println(x);
	}

}
class Sample1
{
	public static void main(String[] args)
	{
		int a=100;
		System.out.println("Start");
		Demo.m1(a);
		System.out.println("Stop");
	}
}