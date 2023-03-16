package sampleone;
public class Sample1
{
	protected void m1()
	{
		System.out.println("Inside m1 method Sample1- sampleone");
	}
}

class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("Inside Demo");
		Sample1 s1= new Sample1();
		s1.m1();
	}
}