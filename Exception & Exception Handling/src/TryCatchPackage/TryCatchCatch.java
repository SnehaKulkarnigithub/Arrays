package TryCatchPackage;

public class TryCatchCatch {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		System.out.println("Start");
		try
		{
			System.out.println("Inside try Block");
			System.out.println(10/2);
			System.out.println(a[10]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Alternate solution- catch1");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Alternate solution- catch2");
		}
		System.out.println("stop");

	}

}
