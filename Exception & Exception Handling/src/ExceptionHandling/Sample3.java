package ExceptionHandling;

public class Sample3 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println(10/0);
		}
		catch(NullPointerException np)
		{
			System.out.println("Alternate soluntion");
		}
		System.out.println("Stop");

	}

}
