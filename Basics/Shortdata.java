class Shortdata
{
public static void main(String[] args)
{
short a=100;
System.out.println(a);
//short b=32769;CE:possible lossy conversion from int to short
//System.out.println(b);
//short c=32768;CE:possible lossy conversion from int to short
//System.out.println(c);
short d=-32768;
System.out.println(d);
//short e=-32769;CE:possible lossy conversion from int to short
//System.out.println(e);
}
}