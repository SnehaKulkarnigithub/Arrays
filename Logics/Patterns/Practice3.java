class Practice3
{
	int a;
	static int b;
	Practice3()
	{
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		new Practice3();
		new Practice3();
		new Practice3();
		
	}
}