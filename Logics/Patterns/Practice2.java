class Practice2
{
	public static void main(String[] args)
	{
		int n=9;
		for (int rows=1;rows<=n-4;rows++ )
		{
			int k=1;
				for(int i=n-4;i>=rows;i--)
				{ 
					System.out.print(k++ + " ");
				}
				System.out.println();
		}
		for (int rows=2; rows<=n-4 ;rows++)
		{
			int k=1;
			for(int j=rows;j>=1;j--)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
}

//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
//1
//1 2 
//1 2 3 
//1 2 3 4
//1 2 3 4 
