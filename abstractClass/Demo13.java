abstract class Sample1
{
	static
	{
		System.out.println("Inside Static block Saample1");
	}
	{
		System.out.println("Inside Instance Block Sample1");
	}
	Sample1()
	{
		System.out.println("Inside constructor Sample1");
	}
}
class Sample2 extends Sample1
{
	static 
	{
		System.out.println("Inside static block Sample2");
	}
	{
		System.out.println("Inside instance block Sample2");
	}
	Sample2()
	{
		System.out.println("Inside constructor Sample2");
	}
	
}
class Demo13
{
	public static void main(String[] args)
	{
		new Sample2();
	}
}