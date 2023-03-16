
class WellsfargoImp implements Wellsfargo
{
	public void loans() {}
	public void banking() {}
	public void insurance() {}
}

class wellsfargo_loans extends WellsfargoImp
{
	public void loans()
	{
		System.out.println("Code Logics for loans Module");
	}
}

class Demo11
{
	public static void main(String[] args)
	{
		wellsfargo_loans wl=new wellsfargo_loans();
		wl.loans();
	}
	}
