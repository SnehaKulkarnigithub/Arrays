class Demo5
{
	Demo5()
	{
		System.out.println("Inside 0 argm const");
	}

	Demo5(int a)
	{
		System.out.println("Inside 1 argm const");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo5 d5=new Demo5();
		Demo5 d=new Demo5(10);
		System.out.println("Stop");
	}

}