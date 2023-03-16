import java.io.Serializable;

class Emp implements Serializable
{
	int empId;
	String empName;
	Emp(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
}