package StringBuffer;

public class Emp {
	int empId;
	String empName;
	Emp(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public String toString() //Override in Emp class
	{
		return "emp@12ab34cd56ef";
	}

	public static void main(String[] args) {
		Emp e=new Emp(101,"Cyber");
		System.out.println(e.toString());
	}

}
