class RedBus
{
	void payment(int debitCard)
	{
		System.out.println("Logics for DebitCard Transaction");
	}

	void payment(String upi)
	{
		System.out.println("Logics for UPI Transaction");
	}

	void payment(float phonepe)
	{
		System.out.println("Logics for PhonePe Transaction");
	}
}

class Customer
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		RedBus rb=new RedBus();
		rb.payment(1235);
		System.out.println("Stop");
	}
}

// Loan Calculator
/*class Customer    
{
	public static void main(String[] args)
	{
		int amount=20000, ramount=0;
		int i=1; 
		while(i<=3)
		{
			ramount=(amount*10)/100;
			amount=amount-ramount;
			i++;
		}
		System.out.println(amount);
	}
}
*/