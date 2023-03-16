package FinallyBlock;

public class Sample9 {
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
			System.out.println(ae.toString());
			System.out.println("------------------------------------------");
			System.out.println(ae.getMessage());
			System.out.println("------------------------------------------");
			ae.printStackTrace();
		}
	}

}
