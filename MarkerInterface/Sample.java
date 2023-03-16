class Sample implements Cloneable
{
		int a;
		float b;
		Sample(int a, float b)
		{
			this.a=a;
			this.b=b;
		}

		protected Object clone()
		{
			try
			{
				return super.clone();
			}
			catch (CloneNotSupportedException cn)
			{
				System.out.println("Inside catch block");
				return this;
			}
		}
}