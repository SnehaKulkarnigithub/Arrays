class Demo
{
	public static void main(String[] args)
	{
		int a=100;
		//first approach
		Integer i=new Integer(100);
		System.out.println(i);
		System.out.println(i.toString());

		//second approach
		Integer ii=new Integer("1000");
		System.out.println(ii);
		System.out.println(ii.toString());
	}
}

// public java.lang.Integer(int);
// public java.lang.Integer(java.lang.String) throws java.lang.NumberFormatException;