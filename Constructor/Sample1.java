class Demo
{
	Demo()
	{
		System.out.println("Inside Demo 0 arg const");
	}
	Demo(int a)
	{
		this();
		System.out.println("Inside Demo 1 argm const");
	}
}

class Sample1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo s=new Demo(100);
		System.out.println("Stop");
	}
}