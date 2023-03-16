class Sample7
{
	float a;
	static float b=200.5f;
	public static void main(String[] args)
	{
		int c=100;
		System.out.println("Start");
		Sample7 refvar=new Sample7();
		refvar.a=b+c;
		System.out.println(refvar.a);
		System.out.println("Stop");
	}

}