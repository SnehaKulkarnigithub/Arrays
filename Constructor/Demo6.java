class Demo6
{
	Demo6()
	{
		this(10);
		System.out.println("Inside 0 argm const");
	}

	Demo6(int a)
	{
		System.out.println("Inside 1 argm const");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo6 d=new Demo6();
		System.out.println("Stop");
	}
}