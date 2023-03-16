class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		// 1st approach
		int[] a=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		//2nd approach
		int[] b={10,20,30};
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}

		System.out.println("Stop");
	}
}