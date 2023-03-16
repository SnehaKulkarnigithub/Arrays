import java.util.StringTokenizer;
public class Sample6 {

	public static void main(String[] args) {
		StringTokenizer st2=new StringTokenizer("This is , an Example, of String, Tokenizer Class, .....", ",");
		
		while(st2.hasMoreElements())
		{
			System.out.println(st2.nextElement());
		}

	}

}
