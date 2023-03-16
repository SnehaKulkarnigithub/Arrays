class AccessOutsideClass
{
	static int a=100;
}
class AccessOutsideClass1
{
	public static void main(String[] args)
	{
		System.out.println(AccessOutsideClass.a);
	}
}