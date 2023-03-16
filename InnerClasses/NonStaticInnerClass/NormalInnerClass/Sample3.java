class Outer4
{
	private int x=1000;
	private float y=2000.5f;

	class Inner4
	{
		void m2()
		{
			System.out.println("Inside m2 method");
			System.out.println(x+y);
		}
	}
}
class Sample3
{
	public static void main(String[] args)
	{
		new Outer4(). new Inner4().m2();
	}
}