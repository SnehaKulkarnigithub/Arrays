class Triangle
{
	public static void main(String[] args)
		{

	for(int row=1; row<=3; row++)
	{
		for(int b=3;b>row;b--)
		{
			System.out.print(" ");
		}
		for (int s=1;s<=row ;s++ ) //number of rows is equalas to Number of Stars
		{
			System.out.print(" *");
		}
		System.out.println();
	}
		}
}