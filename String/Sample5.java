import java.util.StringTokenizer;
public class Sample5 {

	public static void main(String[] args) {
		StringTokenizer st1=new StringTokenizer("This is an Example of String Tokenizer class.");
		
		while(st1.hasMoreElements())
		{
			System.out.println(st1.nextElement());
		}
		

	}

}
