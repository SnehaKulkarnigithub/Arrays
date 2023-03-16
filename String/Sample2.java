
public class Sample2 {

	public static void main(String[] args) {
		String str1=" Cybere ";
		System.out.println(str1.charAt(3));
		//System.out.println(str1.charAt(20));CE:Exception
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.indexOf("z"));
		System.out.println(str1.contains("ber"));
		System.out.println(str1.contains("xyz"));
		System.out.println(str1.lastIndexOf("e"));
		System.out.println(str1.lastIndexOf("a"));
		
		System.out.println("-----------------------------------");
		
		System.out.println(str1.startsWith(" Cyb"));
		System.out.println(str1.startsWith("ybe"));
		System.out.println(str1.endsWith("re "));
		System.out.println(str1.endsWith("abc"));
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println("-----------------------------------");
		
	}

}
