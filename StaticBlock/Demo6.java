class Success
{
	int a=1150;
	Success m1()
	{
		System.out.println("Inside m1 method");
		return this;
	}

}

class Demo6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Success s=new Success();
		Success ss=s.m1();
		System.out.println(ss.a);
		System.out.println(s);
		System.out.println(ss);
		System.out.println("Stop");
	}
}