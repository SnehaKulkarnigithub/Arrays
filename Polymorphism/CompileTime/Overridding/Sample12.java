class Parent
{
	protected void m1()
	{
		System.out.println("Inside m1 method Parent");
	}
}
class Child extends Parent
{
	protected void m1()
	{
		System.out.println("Inside m1 method Child");
	}
}
class Sample12
{
	public static void main(String[] args)
	{
		Parent p=new Child();
		p.m1();
	}
}