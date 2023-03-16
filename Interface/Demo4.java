interface It4
{
	int a=100;
}
class Demo4 implements It4
{
	void m1()
	{
		System.out.println("Inside m1 method"+a);
	}
	public static void main(String[] args)
	{
		Demo4 d=new Demo4();
		d.m1();
	}
}