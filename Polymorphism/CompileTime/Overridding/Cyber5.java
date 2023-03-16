class Parent
{
	Parent m1()
	{
		System.out.println("Inside m1 method -PArent return ref");
		return new Parent();
	}
}
class Child extends Parent
{
	Child m1()
	{
		System.out.println("Inside m1 method -Child return ref");
		return new Child();
	}
}
class Cyber5
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
	}
}