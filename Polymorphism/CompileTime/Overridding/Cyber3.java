//Overidden
class Parent
{
	int m1()
	{
		System.out.println("Inside m1 method -Parent");
		return 20;
	}
}

//Overridding
class Child extends Parent
{
	int m1()
	{
		System.out.println("Inside m1 method - Child");
		return 30;
	}
}
class Cyber3
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
	}
}