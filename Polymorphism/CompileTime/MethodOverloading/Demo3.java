class Demo3
{
	public static void main()
	{
		System.out.println("Inside main 0 argm");
	}
	public static void main(int x)
	{
		System.out.println("Inside main 1 argm");
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		Demo3 d3=new Demo3();
		d3.main(10);
		System.out.println("Stop");
	}
}