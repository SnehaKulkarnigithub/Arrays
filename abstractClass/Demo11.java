abstract class Sample1
{
	Sample1()
	{
		System.out.println("Inside o argm constructor Sample1");
	}
	Sample1(int x)
	{
		this();
		System.out.println("Inside 1 argm constructor Sample1");
	}
	{
		System.out.println("Inside Instance Block Sample1");
	}
}
class Sample2 extends Sample1
{
	Sample2(int y)
	{
		super(100);
		System.out.println("Inside 1 argm constructor Sample2");
	}
	{
		System.out.println("Inside Instance Block Sample2");
	}
	
}
class Demo11
{
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2(200);

	}
}