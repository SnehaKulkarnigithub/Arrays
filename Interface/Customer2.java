class Customer2 implements HSBC_BankLoans
{
	public void bankAccount()
	{
		System.out.println("Inside Current Bank Account");
	}
	public void bankLoans()
	{
		System.out.println("Inside bank Loans"); 
	}
	public static void main(String[] args)
	{
		System.out.println("Inside Customer 2");
		HSBC_BankLoans cust2=new Customer2();
		cust2.bankAccount();
		cust2.bankLoans();
	}
}