class Demo2
{
	int a=100;
	float b=200.5f;
	Demo2(int a, float b)
	{
		System.out.println("Inside Constructor");
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		Demo2 d=new Demo2(10, 20.5f);
		System.out.println("Stop");
	}
}