class Parent
{
	void carkeys()
	{
		System.out.println("Inside Parent CikeKeys method");
	}
}
class Child extends Parent
{
	void bikekeys()
	{
		System.out.println("Inside Child Bikekeys method");
	}
}
class Sample8
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.carkeys();
		//p.bikekeys();
	}
}