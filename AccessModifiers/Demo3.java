package demothree;
public class Demo3
{
	public void m1()
	{
		System.out.println("Inside m1- Default");
	}
}
class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("Inside Demo1");
		Demo3 d3=new Demo3();
		d3.m1();
	}
}