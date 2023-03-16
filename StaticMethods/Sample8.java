class Demo
{
	static int a=100;
}

class Sample8
{
	float b;
	public static void main(String[] args)
	{
		float c=300.5f;
		System.out.println("Start");
		Sample8 refvar= new Sample8();
		refvar.b=c+Demo.a;
		System.out.println(refvar.b);
		System.out.println("Stop");


	}
}