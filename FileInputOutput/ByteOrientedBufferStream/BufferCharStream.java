import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class BufferCharStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		//Read
		FileReader fr=new FileReader("C:\\Users\\ajink\\OneDrive\\Javaprogram\\FileInputOutput\\ByteOrientedBufferStream\\Cyber1.txt");
		BufferedReader br=new BufferedReader(fr);
		//Write
		FileWriter fw=new FileWriter("C:\\Users\\ajink\\OneDrive\\Javaprogram\\FileInputOutput\\ByteOrientedBufferStream\\Success1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		int data;
		while((data=br.read()) != -1)
		{
			System.out.println(" " + (char)data);
			bw.write(data);
		}

		fr.close();
		br.close();
		bw.close();
		fw.close();
	}
}