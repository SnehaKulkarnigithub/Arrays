class Demo1
{
	int a=100;
	float b=200.5f;

	void m1(int a, float b)
	{
		System.out.println("Inside M1 method");
		System.out.println(a+b);
		System.out.println(this.a + this.b);
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1();
		d1.m1(10,20.5f);
		d2.m1(1000,2000.5f);
		System.out.println("Stop");
	}

}