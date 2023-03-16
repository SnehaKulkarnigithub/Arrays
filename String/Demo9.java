
public class Demo9 {

	public static void main(String[] args) {
		String str1="CYBER";
		String str2="Cyber";
		System.out.println(str1.equals(str2));//Case Sensitive
		System.out.println(str1.equalsIgnoreCase(str2));//Case Insensitive
		System.out.println(str1.compareTo(str2));//Case Sensitive
		System.out.println(str1.compareToIgnoreCase(str2));//Case Insensitive
	}
}
//public boolean equalsIgnoreCase(java.lang.String);
//public int compareToIgnoreCase(java.lang.String);