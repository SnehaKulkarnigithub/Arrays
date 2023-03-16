class Sample1
{
	int a;
	{
		System.out.println("Inside Instance Block" + a);
		a=10;
	}
	Sample1()
	{
		System.out.println("Inside 0 argm const" +a);
		a=100;
		System.out.println(a);
	}
	Sample1(int x)
	{
		System.out.println("Inside 1 argm const" + a);
		a=1000;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println("Inside Main");
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1(100);

	}

}