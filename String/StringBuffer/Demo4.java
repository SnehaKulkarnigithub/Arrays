package StringBuffer;

public class Demo4 {

	public static void main(String[] args) {
		//String--> StringBuffer
		String str1="Training";
		//System.out.println(str1.reverse());CE:
		StringBuffer sb1=new StringBuffer(str1);
		System.out.println(sb1.toString());
		System.out.println(sb1.reverse().toString());

	}
}
//public java.lang.StringBuffer(java.lang String);
//public synchronized java.lang.SringBuffer reverse();
