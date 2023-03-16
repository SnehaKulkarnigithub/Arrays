/*
 1010101
  10101
   101
    1
  
 */
public class Practice7 {

	public static void main(String[] args) {
		int n=7;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-1;k>=i;k--)
			{
				flag=1;
				System.out.print(" "+flag);
			}
			flag=0;
			System.out.println();
		}

	}

}
