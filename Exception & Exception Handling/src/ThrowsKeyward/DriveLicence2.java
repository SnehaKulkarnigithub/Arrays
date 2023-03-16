package ThrowsKeyward;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DriveLicence2 {
	void rtoOfficer() throws InterruptedException, FileNotFoundException
	{
		System.out.println("Inside rto officer");
		Thread.sleep(3000);
		File f=new File("C://Cyber.txt");
		FileInputStream fis=new FileInputStream(f);
	}
	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		System.out.println("main decision to take Driving Licence");
		DriveLicence2 dl2=new DriveLicence2();
		dl2.rtoOfficer();
	}

}
