class EmpOrg2
{
	public static void main(String[] args)
	{
		Emp e1=new Emp(101,"Cyber");
		Emp e2=new Emp(201,"Success");
		Emp e3=new Emp(203,"Training");

		Emp[] e=new Emp[5];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;

		for(Emp ee : e )
		{
			if(ee instanceof Emp)
			{
				System.out.println(ee.empId+" - "+ee.empName);
			}
			else 
			{
				System.out.println(ee);
			}
		}
	}
}