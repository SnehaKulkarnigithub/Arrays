class HdfcBank
{
float currentBalance;
	{
		System.out.println("Login to check and verify Adhar and Pan Details");
	}
	HdfcBank(int deposit)
	{
		System.out.println("Please wait your account is getting created...");
		currentBalance=currentBalance+deposit;
	}
	float getBalance()
	{
		System.out.println("Printing your balance .... kindly wait....!");
		return currentBalance;
	}
	void withdrawAmount(int amount)
	{
		if(amount <= currentBalance)
		{
			System.out.println("Amount of "+amount+" has been debited from account");
			currentBalance=currentBalance-amount;
		}
		else
		{
			System.out.println("Control Yourself");
		}
	}
}