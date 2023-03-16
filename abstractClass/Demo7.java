abstract class Parent
{
	Parent()
	{
		System.out.println("Inside 0 args Constructor -Parent");
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Inside 0 nargm constructor -Child");
	}
}
class Demo7 
{
	public static void main(String[] args)
	{
		Child d=new Child();
	}
}