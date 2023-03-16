class Typecasting
{
	public static void main(String[] args)
	{
		float a=100; //int-->float-->compiler-->typecasting
		System.out.println(a);
		//int b=200.5f; CE: possible lossy conversion from float to int
	}
}