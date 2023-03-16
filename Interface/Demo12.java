interface It11
{
	default void m1()
	{
		System.out.println("Inside m1 method");
	}
}
public class Demo12 implements It11
{

	public static void main(String[] args) {
		Demo12 d=new Demo12();
		d.m1();
	}

}
