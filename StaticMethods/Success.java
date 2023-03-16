class Demo
{
int a=100;
void m1()
{
System.out.println("Inside m1");
}
}

class Success
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.m1();
	}
}