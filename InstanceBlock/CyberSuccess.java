class CyberSuccess
{
	public static void main(String[] args)
	{
		HdfcBank acc1=new HdfcBank(10000);
		float currentBalance=acc1.getBalance();
		System.out.println("Your current Balance is "+currentBalance);
		acc1.withdrawAmount(5000);
		currentBalance=acc1.getBalance();
		System.out.println("Your current Balance is "+currentBalance);
	}

	}