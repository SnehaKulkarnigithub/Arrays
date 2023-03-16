import java.util.Scanner;
class Scan1
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner("This is first example of on Scanner Class");
		while(sc1.hasNext())
		{
			System.out.println(sc1.next());
		}
	}
}
//public java.util.Scanner(java.lang.String)
//public boolean hasNext();
//public java.lang.String next();