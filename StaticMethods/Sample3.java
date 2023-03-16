class Demo
{
static boolean a=true;
static void m1(boolean b)
	{
	System.out.println("Inside M1 method");
	a=b;
	System.out.println(a);
	}
}

class Sample3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		boolean x=true;
		Demo.m1(x);
		System.out.println("Stop");
	}
}