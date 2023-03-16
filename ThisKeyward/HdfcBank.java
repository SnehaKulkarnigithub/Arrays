class HdfcBank
{
	float currentBalance;
	HdfcBank(int Deposit)
	{
		System.out.println("Please wait your account is getting created.....");
		currentBalance=currentBalance+Deposit;
	}
	float getBalance()
	{
		System.out.println("Printing your Balance Kindly Wait......");
		return currentBalance;
	}

	void withdrawAmount(int amount)
	{
		if(amount<=currentBalance)
		{
			System.out.println("Amount of "+amount+" is debited from your account");
			currentBalance=currentBalance-amount;
		}
		else
			System.out.println("Control Yourself...");
	}
}