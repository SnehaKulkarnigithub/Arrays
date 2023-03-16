class GrandParent
{
	int a=10;
	void m1()
	{
		System.out.println("Inside m1 method -GrandParent"+this.a);
	}
}
class Parent extends GrandParent
{
	float b=20.5f;
	void m2()
	{
		System.out.println("Inside m2 method -PArent"+this.b);
	}
}
class Child extends Parent
{
	char c='x';
	void m3()
	{
		System.out.println("Inside m3 method Child "+ this.c);
	}
}
class Cyber
{
	static void test(GrandParent gd)
	{
		System.out.println("Inside test method Cyber");
		gd.m1();
	}
}
class Sample6
{
	public static void main(String[] args)
	{
		Cyber.test( new Child() );

	}
}