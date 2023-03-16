class Parent
{
	void bikekeys()
	{
		System.out.println("Inside bikekeys method-Parent");
	}
}
class Child extends Parent
{
	void bikekeys()
	{
		System.out.println("Inside bikekeys method- Child");
	}
}
class Sample7
{
	public static void main(String[] args)
	{
		Parent p=new Child();
		p.bikekeys();
	}
}