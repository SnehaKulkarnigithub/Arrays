package TryCatchPackage;

public class TryInsideTry {

	public static void main(String[] args) {
		int a=50;
		int[] b= {10,20,30};
		try {
			System.out.println("Inside try Block 1");
			try {
				System.out.println("inside try Block 2");
				System.out.println(b[20]);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("Inside catch Block 2");
			}
			System.out.println(a/0);
		}
		catch(Exception ee)
		{
			System.out.println("Inside catch block 1");
		}

	}

}
