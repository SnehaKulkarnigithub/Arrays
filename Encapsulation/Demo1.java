class Sample
{
	private int a;
	public void setval(int a)
	{
		this.a=a;
	}
	public int getval()
	{
		return this.a;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.setval(10);
		int aa=s.getval();
		System.out.println(aa);
	}

}
