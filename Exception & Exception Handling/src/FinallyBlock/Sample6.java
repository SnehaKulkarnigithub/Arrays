package FinallyBlock;

public class Sample6 {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(10/0);
		try
		{
			System.out.println("Inside try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Stop");

	}

}
