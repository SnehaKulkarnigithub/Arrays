class Intdata
{
public static void main(String[] args)
{
	int a=2147483647;
	System.out.println(a);
	//int b=2147483648; CE:integer number too large: 2147483648
	//System.out.println(b);
	int c=-2147483648;
	System.out.println(c);
	//int d=-2147483649; CE:integer number too large: -2147483649
	//System.out.println(d);

}
}