package ExceptionHandling;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println(10/2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Alternate soluntion");
		}
		System.out.println("Stop");

	}

}
