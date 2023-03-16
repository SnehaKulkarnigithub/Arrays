class Parent
{
	void carkeys()
	{
		System.out.println("Inside Parent carkeys method");
	}
	void homekeys()
	{
		System.out.println("Inside Parent homekeys method");
	}
}
class Child extends Parent
{
	void bikekeys()
	{
		System.out.println("Inside child bikekeys method");
	}
	void homekeys()
	{
		System.out.println("Inside child homekeys method");
	}
}
class Test
{
	public static void main(String[] args)
	{
	Parent p=new Child();
	p.carkeys();// Upcasting
	p.homekeys();// No upcasting
	//p.bikekeys(); CE
	}
}