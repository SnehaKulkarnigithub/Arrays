package ThrowsKeyward;

public class DriveLicence1 {
	void rtoOfficer() throws ArithmeticException
	{
		System.out.println("Inside rto Officer");
		System.out.println(10/0);
	}
	public static void main(String[] args) throws ArithmeticException
	{
		System.out.println("main decision to take driving Licence");
		DriveLicence1 dl1=new DriveLicence1();
		dl1.rtoOfficer();
	}

}
