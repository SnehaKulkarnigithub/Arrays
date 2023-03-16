package ThrowsKeyward;

public class DriveLicence {
	void rtoOffice() throws InterruptedException
	{
		System.out.println("Inside rto Office");
		Thread.sleep(3000);
	}
	void rtoAgent() throws InterruptedException
	{
		System.out.println("Inside rto Agent");
		rtoOffice();
	}
	void rtoOfficer() throws InterruptedException
	{
		System.out.println("Inside rto Officer");
		rtoAgent();
	}
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("main decision to take Driving Licence ");
		DriveLicence dl=new DriveLicence();
		dl.rtoOfficer();
		
	}

}
