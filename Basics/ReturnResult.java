class ReturnResult
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a=100;
		float result=m1(a);
		System.out.println(a);
		System.out.println("Stop");
	}

	static float m1(int a)
	{
		System.out.println("Inside m1");
		float result=a+200.5f;
		return result;
	}
}