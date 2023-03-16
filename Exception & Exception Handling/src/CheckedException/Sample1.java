package CheckedException;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Start");
		//Thread.sleep(3000);  CE:Interrupted Exception Occure here
		System.out.println("Stop");

	}
}
// CheckedException --> InterruptedException