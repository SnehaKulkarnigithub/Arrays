package ThrowKeyward;

public class CheckBalance {
	int amountBalance=5000;
	void verifyBalance(int newBal)
	{
		if(amountBalance >= newBal)
		{
			amountBalance=amountBalance-newBal;
		}
		else
		{
			throw new ArithmeticException("Please enter Valid Amount");
		}
	}
	void getBal()
	{
		System.out.println(amountBalance);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		CheckBalance cb=new CheckBalance();
		cb.verifyBalance(7000);
		cb.getBal();
		System.out.println("Stop");
	}

}
