abstract class Sample1
{
	static int a=100;
	static
	{
		System.out.println("Inside static block Sample1 "+a);
	}
}
class Demo12 extends Sample1
{
	static
	{
		System.out.println("Inside static block Demo12 "+a);
	}
	public static void main(String[] args)
	{
		Demo12 d=new Demo12();
	}
}