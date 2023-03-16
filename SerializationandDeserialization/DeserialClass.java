import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class DeserialClass
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\ajink\\OneDrive\\Javaprogram\\SerializationandDeserialization\\CyberObj.txt");

		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp ee=(Emp) ois.readObject();
		System.out.println(ee.empId+" - "+ee.empName);
	}
}