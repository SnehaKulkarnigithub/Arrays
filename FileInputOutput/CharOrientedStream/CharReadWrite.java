import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class CharReadWrite
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		//Read
		FileReader fr=new FileReader("E:\\Javaprogram\\FileInputOutput\\CharOrientedStream\\Cyber1.txt");

		//Write
		FileWriter fw=new FileWriter("E:\\Javaprogram\\FileInputOutput\\CharOrientedStream\\Succes1.txt");
		int info;

		while((info=fr.read()) != -1)
		{
			System.out.print(" " + (char)info);
			fw.write(info);
		}

		fr.close();
		fw.close();


	}
}