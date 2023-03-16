import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Scan2
{
	public static void main(String [] args) throws FileNotFoundException
	{
		File f1=new File("C:\\Users\\ajink\\OneDrive\\Javaprogram\\ScannerClass\\Scan2Read.txt");
		Scanner sc2=new Scanner(f1);
		while(sc2.hasNext())
		{
			System.out.println(sc2.next());
		}
	}
}
//public java.util.Scanner(java.io.File);
//public java.io.File(java.lang.String);
//public boolean hasNext();
//public java.lang.String next();