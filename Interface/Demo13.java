interface It13
{
	default void m1()
	{
		System.out.println("Inside m1 method -Interface");
	}
}
public class Demo13 implements It13 
{
	public void m1()
	{
		System.out.println("Inside m1 method -Demo13");
	}
	public static void main(String[] args)
	{
		Demo13 dd=new Demo13();
		dd.m1();
		It13 i=new Demo13();
		i.m1();
	}

}
