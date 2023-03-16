class MarriageEligibility
{
	public static void main(String[] args)
	{
		int age=19;
		char gender='M';

		if ((age>=18 && gender=='F') || (age>=21 && gender=='M'))
		{
			System.out.println("Congratulations you are Eligible for Marriage");
		}
		else
		{
			System.out.println("You are not Eligible for Marriage");
		}
	}
}
