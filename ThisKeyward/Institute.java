//when do you member static or Non static 

class Institute
{
	static String instituteName="Cyber Success";
	int studId;
	String studName;

	void setStudInfo(int studId, String studName)
	{
		this.studId=studId;
		this.studName=studName;
	}
	void getStudInfo()
	{
		System.out.print("The StudId is "+studId+" , Student Name is "+studName);
		System.out.println(" The Institute Name is "+instituteName);
	}

	public static void main(String[] args)
	{
		Institute stud1=new Institute();
		stud1.setStudInfo(101,"Jack Sparrow");
		stud1.getStudInfo();
		Institute stud2=new Institute();
		stud2.setStudInfo(102, "Salman Khan");
		stud2.getStudInfo();
	}
}