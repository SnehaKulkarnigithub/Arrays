class DisplayResultInStatic
{
	static float a;
	public static void main(String[] args)
	{
		System.out.println("Start");
		int x=200;
		a=x+m1();
		System.out.println(a);
		System.out.println("Stop");
	}
	static float m1()
	{
		System.out.println("Inside m1");
		float y=200.5f;
		return y;
	}

}