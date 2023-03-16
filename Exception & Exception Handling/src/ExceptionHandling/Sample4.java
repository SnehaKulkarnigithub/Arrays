package ExceptionHandling;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("Inside try Block");
			System.out.println(10/0);
		}
		catch(NullPointerException np)
		{
			System.out.println("Alternate solution");
		}
		System.out.println("Stop");

	}

}
