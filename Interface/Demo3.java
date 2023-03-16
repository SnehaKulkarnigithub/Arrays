interface HSBC
{
	void loans();
	void banking();
	void insurance();
}
abstract class HSBC_loans implements HSBC
{
	public void loans()
	{
		System.out.println("Inside loans method");
	}
}
abstract class HSBC_banking extends HSBC_loans
{
	public void banking()
	{
		System.out.println("Inside banking method");
	}
}
class HSBC_insurance extends HSBC_banking
{
	public void insurance()
	{
		System.out.println("Inside insurance method");
	}
}
class Demo3
{
	public static void main(String[] args)
	{
		HSBC h=new HSBC_insurance();
		h.loans();
		h.banking();
		h.insurance();
	}
}