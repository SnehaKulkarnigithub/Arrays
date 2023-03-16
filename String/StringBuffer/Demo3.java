package StringBuffer;

public class Demo3 {
	Demo3(String str)
	{
		
	}

	public static void main(String[] args) {
		Demo3 d1=new Demo3("Cyber");
		Demo3 d2=new Demo3("Cyber");
		System.out.println(d1.equals(d2));  //Object--> Reference Comparison
		System.out.println("---------------------");
		String str1=new String("Cyber");
		String str2=new String("Cyber");
		System.out.println(str1.equals(str2));  //content comparison done here
		System.out.println("---------------------");
		StringBuffer sb1=new StringBuffer("Cyber");
		StringBuffer sb2=new StringBuffer("Cyber");
		System.out.println(sb1.equals(sb2));   //reference Comparison done here
	}

}
