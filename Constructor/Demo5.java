class Demo5
{
	Demo5()
	{
		System.out.println("Inside 0 Argm const");
	}
	Demo5(int a)
	{
		System.out.println("Inside 1 Argm const");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo5 d1=new Demo5();
		Demo5 d2=new Demo5(100);
		System.out.println("stop");
	}
}