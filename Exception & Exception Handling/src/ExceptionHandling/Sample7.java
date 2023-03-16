package ExceptionHandling;

public class Sample7 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Alternate solution-ae");
		}
		catch(Exception e)
		{
			System.out.println("Alternate solution-e");
		}
		System.out.println("Stop");

	}

}
