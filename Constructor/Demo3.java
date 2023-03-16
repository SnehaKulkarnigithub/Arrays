class Demo3
{
	int a;
	static int x;
	Demo3(int a)
	{
		System.out.println("inside Constructor");
		this.a=a;
		Demo3.x=a;
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(Demo3.x);
		Demo3 d=new Demo3(100);
		System.out.println(Demo3.x);
		System.out.println("Stop");
	}
}