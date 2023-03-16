package FinallyBlock;

public class Sample10 {
	void m3()
	{
		System.out.println("Inside m3 method");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
			System.out.println(ae.toString());
			System.out.println("-------------------------------------------------");
			System.out.println(ae.getMessage());
			System.out.println("-------------------------------------------------");
			ae.printStackTrace();
		}
	}
	void m2()
	{
		System.out.println("Inside m2 method");
		m3();
	}
	void m1()
	{
		System.out.println("Inside m1 method");
		m2();
	}
	public static void main(String[] args)
	{
		Sample10 s10=new Sample10();
		s10.m1();
	}

}
