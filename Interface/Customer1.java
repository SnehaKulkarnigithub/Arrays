class Customer1 implements HSBC_BankAccount
{
	public void bankAccount()
	{
		System.out.println("Inside bank Account");
	}
	public static void main(String[] args)
	{
		System.out.println("Inside Customer1");
		HSBC_BankAccount cust1=new Customer1();
		cust1.bankAccount();
	}
}
