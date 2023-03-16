import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

class ByteBufferStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		//Read
		FileInputStream fis=new FileInputStream("C:\\Users\\ajink\\OneDrive\\Javaprogram\\FileInputOutput\\ByteOrientedBufferStream\\Cyber.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);

		//Write
		FileOutputStream fos=new FileOutputStream("C:\\Users\\ajink\\OneDrive\\Javaprogram\\FileInputOutput\\ByteOrientedBufferStream\\Success.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);

		int info;

		while((info=bis.read()) != -1)
		{
			System.out.print(" "+(char)info);
			bos.write(info);
		}

		fis.close();
		bis.close();
		
		bos.close();
		fos.close();
	}
}