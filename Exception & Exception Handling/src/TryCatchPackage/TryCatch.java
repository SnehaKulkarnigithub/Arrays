package TryCatchPackage;

public class TryCatch {

	public static void main(String[] args) {
		int a=20;
		int[] b= {10,20,30,40,50};
		try {
			System.out.println("Inside try Block 1");
			System.out.println(a/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside catch Block");
		}
		try {
			System.out.println("Inside try Block 2");
			System.out.println(b[10]);
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Inside catch Block 2");
		}
		

	}

}
