/* 1 2 3 4 5
   2 3 4 5 1
   3 4 5 1 2
   4 5 1 2 3
   5 1 2 3 4
 */
class Practice5 {

	public static void main(String[] args) {
		
		for(int i=1 ;i<=5;i++) //rows count
		{
			for(int j=i; j<=5;j++) //column count form 1 to 5
			{
				System.out.print(j+" ");
			}
			for(int k=1;k<=i-1;k++)  //column count form 2 row
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	}



