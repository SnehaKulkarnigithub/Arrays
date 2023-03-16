class Customer3 implements BOA_freeInsurance
{
	public void bankAccount()
	{
		System.out.println("Inside Bank Account");
	}
	public void bankLoans()
	{
		System.out.println("Inside Bank Loans");
	}
	public void bankFreeInsurance()
	{
		System.out.println("Inside free insurance by bank");
	}

	public static void main(String[] args)
	{
		Customer3 cust3=new Customer3();
		cust3.bankAccount();
		cust3.bankLoans();
		cust3.bankFreeInsurance();
	}
}

