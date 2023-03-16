class Success
{
}
class Parent
{
	Success m1()
	{
		System.out.println("Inside m1 method parent return ref");
		return new Success();
	}
}
class Child extends Parent
{
	Success m1()
	{
		System.out.println("Inside m1 method Child return ref");
		return new Success();
	}
}
class Cyber4
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
	}
}