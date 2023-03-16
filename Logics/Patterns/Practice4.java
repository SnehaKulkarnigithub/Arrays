class Practice4
{
	public static void main(String[] args)
	{
		for (int row=1;row<=5; row++ )
		{
			for(int i=1;i<=3;i++)
			{
				if(i==2 && row==2)
				{
					System.out.print("   ");
				}
				else if(i==2 && row==4)
				{
					System.out.print("   ");
				}
				else if(i==2 && row==5)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}