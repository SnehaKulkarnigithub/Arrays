class Cyber111
{
	int a=100;
}
class Cyber11
{
	float x=200.5f;
}
class Cyber1
{
	float c;
	public static void main(String[] args)
	{
		System.out.println("Start");

		Cyber1 o1=new Cyber1();
		Cyber11 o2 = new Cyber11();
		Cyber111 o3 = new Cyber111();

		o1.c = o2.x + o3.a;

		System.out.println(o1.c);
		System.out.println("Stop");
	}
}