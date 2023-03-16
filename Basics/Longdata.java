class Longdata
{
public static void main(String[] args)
{
	long a=200;
	System.out.println(a);
	//int b=234l; CE:incompatible types: possible lossy conversion from long to int
	//int c=234L; CE:incompatible types: possible lossy conversion from long to int
	long x=300l;
	long y=300L;
	System.out.println(x);
	System.out.println(y);

}
}