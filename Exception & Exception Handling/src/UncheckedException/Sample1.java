package UncheckedException;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(10/0);
		System.out.println("Stop");
	}
}
//All Exceptions are treated as classes
//UncheckedException --> ArithmaticException
//All Exception classes are part of java.lang package