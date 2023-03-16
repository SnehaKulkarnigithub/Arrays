class Parent
{
	int a=100;
	void m1()
	{
		System.out.println("Inside m1 method -Parent"+this.a);
	}
}
class Child extends Parent
{
	float b=200.5f;
	void m2()
	{
		System.out.println("Inside m1 method -Child "+this.b);
	}
}
class Sample5
{
	public static void main(String[] args)
	{
		//Overridden
		Parent p=new Child();
		p.m1();
		Child c=(Child)p;
		c.m1();
		c.m2();

	}
}