import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

class Scan4
{
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader fr=new FileReader("C:\\Users\\ajink\\OneDrive\\Javaprogram\\ScannerClass\\Scan4Read.txt");
		Scanner sc4=new Scanner(fr);
		while(sc4.hasNext())
		{
			System.out.println(sc4.next());
		}
	}
}
//public java.util.Scanner(java.lang.Readable);
//public boolean hasNext();
//public java.lang.String next();