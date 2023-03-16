class MethodReturnsValue
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		float b=m1();
		System.out.println(b);
		System.out.println("Stop");
	}
	static float m1()
	{
		System.out.println("Inside m1");
		float a=100.5f;
		return a;
	}
}