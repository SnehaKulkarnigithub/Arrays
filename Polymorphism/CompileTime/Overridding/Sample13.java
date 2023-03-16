class Parent 
{
	protected void m1()
	{
		System.out.println("Inside method m1 Parent");
	}
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("Inside method m1 Child");
	}
}
class Sample13
{
	public static void main(String[] args)
	{
		Parent p=new Child();
		p.m1();
	}
}


/*class Parent
{
	int a=100;
}
class Child extends Parent
{
	int a=200;
}
class Sample13
{
	public static void main(String[] args)
	{
		Parent p=new Child();
		System.out.println(p.a);
	}
}
*/