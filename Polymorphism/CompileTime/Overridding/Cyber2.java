class Parent
{
	void job()
	{
		System.out.println("Inside Govmt job");
	}
}
class Child extends Parent
{
	
}
class Cyber2
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.job();
	}
}