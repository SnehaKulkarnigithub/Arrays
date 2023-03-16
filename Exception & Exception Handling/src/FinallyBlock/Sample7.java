package FinallyBlock;

public class Sample7 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("Inside try block");
			System.exit(0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}

	}

}
