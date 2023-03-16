class NonStatInNonStat
{
static boolean a=true;
static void m2()
{
System.out.println("Inside m2 Method");
}
}
class Cyber2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Cyber2 c=new Cyber2();
		c.m1();
		System.out.println("Stop");
	}

	void m1()
	{
		System.out.println("Inside Method m1");
		//class 
		System.out.println(NonStatInNonStat.a);
		NonStatInNonStat.m2();
		//object
		NonStatInNonStat obj2=new NonStatInNonStat();
		System.out.println(obj2.a);
		obj2.m2();
	}
}