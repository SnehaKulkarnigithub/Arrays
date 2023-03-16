import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class SerialClass
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\ajink\\OneDrive\\Javaprogram\\SerializationandDeserialization\\CyberObj.txt");
		Emp e=new Emp(101, "jackSparrow");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
	}
}