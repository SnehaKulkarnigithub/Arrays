class Parent
{
	void m1()
	{
		System.out.println("Inside m1 -Parent");
	}
}
class Child extends Parent
{
	void m1(int a)
	{
		System.out.println("Inside m1 -Child");
	}
}
class Demo4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child c=new Child();
		c.m1();
		System.out.println("Stop");
	}

}