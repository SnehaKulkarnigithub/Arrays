class Bytedata
{
public static void main(String[] args)
{
	byte a=20;
	System.out.println(a);
	byte b=127;
	System.out.print(b);
	//byte c=129;   CE:value is beyond the byte range
	//System.out.println(c);

	byte d=-128;
	System.out.println(d);
	//byte e=-129; CE:possible lossy conversion from int to byte
	//System.out.println(e);

}
}