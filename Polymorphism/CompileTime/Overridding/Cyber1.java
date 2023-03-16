class Parent
{
	void job()
	{
		System.out.println("Inside Govmt job");
	}
}
class Child extends Parent
{
	void job()
	{
		System.out.println("Inside Private job");
	}
}
class Cyber1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child c=new Child();
		c.job();
		System.out.println("Stop");
	}
}