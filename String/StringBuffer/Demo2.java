package StringBuffer;

public class Demo2 {

	public static void main(String[] args) {
		String str1="Cyber ";
		System.out.println(str1);
		str1=str1.concat("Success"); //concatenate the two strings in String class
		System.out.println(str1);
		System.out.println("-----------------");
		StringBuffer sb1=new StringBuffer("Cyber ");
		System.out.println(sb1.toString());
		System.out.println(sb1.append("Success").toString());  //concatenate the two Strings in StringBuffer class

	}

}
