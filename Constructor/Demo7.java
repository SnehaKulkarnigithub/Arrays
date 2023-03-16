class Demo7
{
	Demo7()
	{
		this(10);
		System.out.println("inside 0 argm const");
	}
	Demo7(int a)
	{
		this(10,20);
		System.out.println("Inside 1 args const");
	}
	Demo7(int b, int c)
	{
		System.out.println("inside 2 args const");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo7 d=new Demo7();
		System.out.println("Stop");
	}

}
