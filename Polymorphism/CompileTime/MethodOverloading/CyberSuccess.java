class Hdfc
{
	Hdfc(int adharNumber)
	{
		System.out.println("Logics for Saving account");
	}
	Hdfc(int companyAdharNumber, String companyName)
	{
		System.out.println("Logics for Current Account");
	}
}
class CyberSuccess
{
	public static void main(String[] args)
	{
		Hdfc h=new Hdfc(12345);
	}
}