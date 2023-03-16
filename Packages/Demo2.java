package packdemoone;
public class Demo1
{
	public void m1()
	{
		System.out.println("Inside m1 method demo1 -packdemoone");
	}
}

class Demo2
{
	public static void main(String[] args)
	{
		System.out.println("Inside Demo2");
		Demo1 d= new Demo1();
		d.m1();
	}
}