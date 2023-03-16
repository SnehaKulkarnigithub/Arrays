package ExceptionHandling;

public class Sample5 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("Inside try Block1");
			System.out.println(10/0);
			System.out.println("Inside try Block2");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Alternate solution");
			System.out.println(10/0);
		}
		System.out.println("Stop");

	}

}
