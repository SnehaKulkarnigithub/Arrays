//C to B
class A
{
	int aa=10;
}
class B extends A
{
	float bb=20.5f;
}
class C extends B
{
	char cc='x';
}
class Sample3
{
	public static void main(String[] args)
	{
		//Upcasting 
		B b1=new C();
		System.out.println(b1.aa);
		System.out.println(b1.bb);
		//Downcasting
		C c1=(C)b1;
		System.out.println(c1.aa);
		System.out.println(c1.aa);
		System.out.println(c1.aa);
	}

}