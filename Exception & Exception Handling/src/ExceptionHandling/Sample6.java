package ExceptionHandling;

public class Sample6 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		System.out.println("Start");
		try
		{
			System.out.println(10/2);//new ArithmeticException
			System.out.println(a[20]);//new ArrayIndexOutOfBoundsException
		}
		catch(Exception e)
		{
			System.out.println("Inside try Block1");
			System.out.println("Alternate solution");
		}

	}

}
