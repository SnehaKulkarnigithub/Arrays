class Emp
{
	private int empId;
	private String empName;
	Emp(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
}
public class Org {

	public static void main(String[] args) {
		Emp emp1=new Emp(101, "John Sparrow");
		int ei=emp1.getEmpId();
		String en=emp1.getEmpName();
		System.out.println("The emp id is "+ei+" , name is "+en);
		System.out.println("Setting new emp Id and Name");
		emp1.setEmpId(202);
		emp1.setEmpName("Tom Hanks");
		ei=emp1.getEmpId();
		en=emp1.getEmpName();
		System.out.println("The emp id is "+ei+" , name is "+en);
		

	}

}
