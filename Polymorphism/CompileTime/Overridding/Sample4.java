//B To A
class A
{
	int aa=1000;
}
class B extends A
{
	float bb=2000.5f;
}
class C extends B
{
	char cc='x';
}
class Sample4
{
	public static void main(String[] args)
	{
		//Upcasting
		A a1=new B();
		System.out.println(a1.aa);
		//Downcasting
		B b1=(B)a1;
		System.out.println(b1.aa);
		System.out.println(b1.bb);

	}
}