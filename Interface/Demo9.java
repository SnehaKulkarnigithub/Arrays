interface Wellsfargo
{
	void loans();
	void banking();
	void insurance();
}
class Demo9 implements Wellsfargo
{
	public void loans()
	{
		System.out.println("Inside loans method");
	}
	public void banking()
	{
	}
	public void insurance()
	{	
	}
	public static void main(String[] args)
	{
		Demo9 d=new Demo9();
		d.loans();
	}
}
