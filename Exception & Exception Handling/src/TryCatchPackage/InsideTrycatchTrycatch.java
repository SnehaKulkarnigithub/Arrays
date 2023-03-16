package TryCatchPackage;

public class InsideTrycatchTrycatch {

	public static void main(String[] args) {
		int a=30;
		int[] b= {10,20,30};
		try{
			System.out.println("Inside try block 1");
			try {
				System.out.println("Inside try block 2");
				System.out.println(a/0);
				}
			catch(Exception ee)
			{
				System.out.println("Inside catch Block 2");
			}
			System.out.println(a/0);
			}
		catch(Exception e)
		{
			System.out.println("Inside catch block 1");
			try
			{
				System.out.println("Inside try Block 3");
				System.out.println(b[20]);
			}
			catch(Exception eee)
			{
				System.out.println("Inside catch Block 3");
			}
		}
		System.out.println(Math.pow(2, 63));
			
		}
		

	}

