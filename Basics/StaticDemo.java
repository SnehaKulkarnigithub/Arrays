class StaticDemo
{
	static int a=100;
	public static void main(String[] args)
	{
		//Local Variable:Direct Access
		float b=200.5f;
		System.out.println(b);
		//Static Variable:Direct Access
		System.out.println(a);
		//Static Variable:Class Name
		System.out.println(StaticDemo.a);
	}
}