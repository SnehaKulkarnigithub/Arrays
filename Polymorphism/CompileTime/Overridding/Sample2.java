//C to A
class A
{
	int aa=100;
}
class B extends A
{
	float bb=200.5f;
}
class C extends B
{
	char cc='x';
}
class Sample2
{
	public static void main(String[] args)
	{
		//Upcasting
		A a1=new C();
		System.out.println(a1.aa);

		//Downcasting
		C c1=(C)a1;
		System.out.println(c1.aa);
		System.out.println(c1.bb);
		System.out.println(c1.cc);
	}
}