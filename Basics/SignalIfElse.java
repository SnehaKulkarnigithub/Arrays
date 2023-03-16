class SignalIfElse
{
	public static void main(String[] args)
		{
		char signal='R';

		if (signal == 'R')
		{
			System.out.println("Please Stop");
		}
		else if (signal == 'G')
		{
			System.out.println("Please Start");
		}
		else if (signal == 'Y')
		{
			System.out.println("Go slow");
		}
		else
			{
				System.out.println("Invalid signal");
			}


	}
}