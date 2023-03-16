
public class Sample3 {

	public static void main(String[] args) {
		String str1="Cybere";
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2,5));
		
		String str2=" Cybere ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		System.out.println("--------------------------------");
		String str3=" Cyb er ";
		System.out.println(str3.length());
		System.out.println(str3.trim().length());
		System.out.println(str3.trim());
	}

}
