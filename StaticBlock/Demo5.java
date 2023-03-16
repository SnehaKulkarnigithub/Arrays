class Demo5
{
	int a=1150;
	static Demo4 m1()
	{
		System.out.println("Inside m1 method");
		return new Demo4();
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo4 ref=Demo4.m1();
		System.out.println(ref.a);
		System.out.println("Stop");
	}
}