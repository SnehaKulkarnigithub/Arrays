class X
{
}
class Sample2
{
	public static void main(String[] args)
	{
		int[] a=new int[3];
		for(int aa :a)
		{
			System.out.println(aa);
		}

		float[] b=new float[3];
		for (float bb : b )
		{
			System.out.println(bb);
		}

		char[] c=new char[3];
		for (char cc : c )
		{
			System.out.println(cc);
		}

		String[] s=new String[3];
		for (String str1 : s )
		{
			System.out.println(str1);
		}

		X[] x=new X[3];
		for (X xx : x )
		{
			System.out.println(xx);
		}
	}
}