package TryCatchPackage;

public class TryInsideCatch {

	public static void main(String[] args) {
		int a=70;
		int[] b= {11,22,33,44,55};
		try{
			System.out.println("Inside Try Block 1");
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch Block 1");
			try {
				System.out.println("Inside try Block 2");
				System.out.println(b[20]);
			}
			catch(Exception ee)
			{
				System.out.println("inside catch Bloc 2");
			}
		}

	}

}
