package FinallyBlock;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(NullPointerException np)
		{
			System.out.println("Alternate solution");
		}
		finally
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Stop");

	}

}
