interface wellsfargoAccount
{
	void bankAccount();
}
interface wellsfargoLoans
{
	void bankLoans();
}
class IDProof
{
	void PAN()
	{
		System.out.println("PAN Details");
	}

	void AADHAR()
	{
		System.out.println("AADHAR Details");
	}
}

class BOA_Cust1 extends IDProof implements wellsfargoAccount, wellsfargoLoans
{
	public void bankAccount()
	{
		System.out.println("Inside bank Account");
	}
	public void bankLoans()
	{
		System.out.println("Inside bank Loans");
	}
	public static void main(String[] args)
	{
		BOA_Cust1 cust4=new BOA_Cust1();
		cust4.PAN();
		cust4.AADHAR();
		cust4.bankAccount();
		cust4.bankLoans();
	}
}