import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ByteReadWrite
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		FileInputStream fis= new FileInputStream("E:\\Javaprogram\\FileInputOutput\\ByteOrientedStream\\Cyber.txt");
		FileOutputStream fos= new FileOutputStream("E:\\Javaprogram\\FileInputOutput\\ByteOrientedStream\\Success.txt");
		int info;

		while((info=fis.read()) != -1)
		{
			System.out.print(" " + (char)info);
			fos.write(info);
		}
		fis.close();
		fos.close();
	}
}