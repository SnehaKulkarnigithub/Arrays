class Demo
{
int a=100;
}
class Sample10
{
	float b=100.5f;
	public static void main(String[] args)
		{
		System.out.println("Start");
		Demo d=new Demo();
		System.out.println(d.a);
		Sample10 ss= new Sample10();
		System.out.println(ss.b);
		System.out.println("Stop");
		}
}