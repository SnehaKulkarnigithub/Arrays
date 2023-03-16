class Demo6
{
	Demo6(boolean a)
	{
		System.out.println("Inside constructor boolean argm");
	}
	Demo6(int x)
	{
		System.out.println("Inside constructor int argm");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo6 d=new Demo6(true);
		Demo6 d1=new Demo6(100);
		System.out.println("Stop");
	}

}
