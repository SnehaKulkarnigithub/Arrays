
public class Demo6 {

	public static void main(String[] args) {
		String str1="Cyber";
		String str2="Success";
		String str3="Cyber";
		//content comparison done here
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		System.out.println("--------------------------");
		String str11=new String("Cyber");
		String str22=new String("Success");
		String str33=new String("Cyber");
		System.out.println(str11.equals(str22));
		System.out.println(str22.equals(str33));
		System.out.println(str33.equals(str11));
		
				

	}

}
