public class Demo4
{
	public String toString()
	{
		return "Inside Demo4 class -toString() method";
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo4 d4=new Demo4();
		//System.out.println(d4);
		System.out.println(d4.toString());
		System.out.println("Stop");
	}
}
