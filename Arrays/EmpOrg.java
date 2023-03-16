class EmpOrg
{
	public static void main(String[] args)
	{
		Emp e1=new Emp(101,"Cyber");
		Emp e2=new Emp(201,"Success");
		Emp e3=new Emp(301,"Training");

		Emp[] ar={e1,e2,e3};
		for(Emp ee :ar)
		{
			System.out.println(ee.empId+" - "+ee.empName);
		}
	}
}