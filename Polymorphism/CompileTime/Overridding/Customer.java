class RBI
{
	void loans()
	{
		System.out.println("The ROI according to the RBI is minimum should be 7%");
	}

	final void activationFees()
	{
		System.out.println("Activation charges are 3 %");
	}
}

class ICICI extends RBI
{
	void loans()
	{
		System.out.println("The ROI according to the ICICI is 15%");
	}

	/*void activationFees()
	{
		System.out.println("Activation charges according to ICICI are 30%");
	}
	*/
}

class YES extends RBI
{
	void loans()
	{
		System.out.println("The ROI according to YES is 14.5%");
	}
}

class Hdfc extends RBI
{
	void loans()
	{
		System.out.println("The ROI according to Hdfc is 14.75%");
	}

}
class Customer
{
	public static void main(String[] args)
	{
		RBI cust1=new ICICI();
		cust1.loans();
		cust1.activationFees();

		//Upcasting

		RBI cust2=new YES();
		cust2.loans();
	}
}