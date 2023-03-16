class Demo
{
	int a=100;
	void m1(int a)
	{
		System.out.println("Inside m1");
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d=new Demo();
		d.m1(1000);
		System.out.println("Stop");

	}
}