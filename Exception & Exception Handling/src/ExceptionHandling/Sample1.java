package ExceptionHandling;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println("Inside try Block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Alternative Solution");
			System.out.println(10/2);
		}

	}

}
