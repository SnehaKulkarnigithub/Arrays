class Demo
{
	public static void main(String[] args)
	{
		Sample s1=new Sample(10,20.5f);
		s1.clone();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1);

		Sample s2=(Sample) s1.clone();
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s2);
	}
}