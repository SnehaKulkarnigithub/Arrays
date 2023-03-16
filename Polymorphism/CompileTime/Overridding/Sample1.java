class Parent
{
	int a=100;
}
class Child extends Parent
{
	float b=200.5f;
}
class Sample1
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.a);
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		//Upcasting
		Parent pp=new Child();
		System.out.println(pp.a);
		//Downcasting
		Child cc=(Child)pp;
		System.out.println(cc.a);
		System.out.println(cc.b);


	}
}