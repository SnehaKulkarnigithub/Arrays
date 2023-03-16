package FinallyBlock;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("Inside try Block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally Block");
			System.out.println(10/0);
		}
		System.out.println("Stop");

	}

}
