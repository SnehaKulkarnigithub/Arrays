class Demo
{
	float a=400.5f;
	void m1() 
	{
		System.out.println("Inside M1 Method");
	}
}
class NonStatInStatMulti
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		//Object
		Demo d= new Demo();
		System.out.println(d.a);
		d.m1();
		System.out.println("Stop");

	}
}