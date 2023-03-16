interface It1
{
	void m1();
}
class Demo1 implements It1
{
	public void m1()
	{
		System.out.println("Inside m1 method Demo1");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo1 d=new Demo1();
		d.m1();

		It1 i=new Demo1();
		i.m1();
		System.out.println("Stop");
	}

}