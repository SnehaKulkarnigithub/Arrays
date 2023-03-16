class Demo2
{
	{
		System.out.println("Inside Instance Block");
	}

	Demo2()
	{
		System.out.println("Inside 0 argm const");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo2 d=new Demo2();
		System.out.println("Stop");
	}

}