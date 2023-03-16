class Sample2 implements Cloneable
{
	int a;
	float b;
	Sample2(int a,float b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Sample2 s21=new Sample2(10,20.5f);
		System.out.println(s21);
		Sample2 s22= (Sample2) s21.clone();
		System.out.println(s22);
	}

}