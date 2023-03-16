abstract class Sample1
{
	{ 
		System.out.println("Inside Instance Block-Sample1");
	}
}
class Sample2 extends Sample1
{
	{
		System.out.println("Inside Instance Block -Sample2");
	}
}
class Demo10
{
	public static void main(String[] args)
	{
		Sample2 s=new Sample2();
	}
}