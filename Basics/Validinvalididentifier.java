class Validinvalididentifier
{
public static void main(String[] args)
{
	int a=100;
	System.out.println(a);
	int aaaaaaaaaa=200;
	System.out.println(aaaaaaaaaa);
	int $=100;
	System.out.println($);
	//int _=200;  CW: warning: '_' used as an identifier
	//System.out.println(_);  CW: warning: '_' used as an identifier

	//int 1=100; throws error

	int a1=2000;
	System.out.println(a1);
	int $1=300;
	System.out.println($1);
	int _1=400;
	System.out.println(_1);

	//int byte=500; reserved words can not used as variable

	int cyber=100;
	int CYBER=200;
	System.out.println(cyber);
	System.out.println(CYBER);
	int Cyber2Success=10;
	//int 4Cyber=10; CE:error: not a statement
	//int all@cyber=10; CE:error: illegal start of type
	int cyber_success_training=10;
	int $_=10;
	//int cyber#=10; CE: error: illegal character: '#'
	//int int=10; CE: reserved words can not used as variable
	//int Integer=10; CE: reserved words can not used as variable
	//int 0123_10=10; CE: Not statement
	int cyber$=10;
	//int 1981$_10=10; CE:not a statement

	//  check wether the following statement are Valid or Invalid?

}
}