
public class greaterNumber {

	public static void main(String[] args) {
		int a=900,b=80,c=60;
		if(a == b && b == c)
		{
			System.out.println("All Numbers are equal");
		}
		else if(a >= b && a >= c)
		{
			if(a==b)
			{
				System.out.println("a and b are equal");
			}
			else if(a==c)
			{
				System.out.println("a and c are equal");
			}
			else if(a>b && a>c)
			{
				System.out.println("a is grater Number");
			}
			else if(b>c)
			{
				System.out.println("b is grater Number");
			}
			else
				System.out.println("c is greater Number");
		}
		else if(b>=c)
		{
			if( b == c)
			{
				System.out.println("b and c are equal");
			}
			else if(b>c)
			{
				System.out.println("b is greater Number");
			}
			else
				System.out.println("c is greater Number");	
		}
		else
			System.out.println("c is greater Number");
	}

}
