
public class Demo7 {

	public static void main(String[] args) {
		//StringBuffer--> String
		StringBuffer sb1=new StringBuffer("Core Java");
		//1st Approach
		String str1=new String(sb1);
		//System.out.pritln(str1.reverse());CE:
		System.out.println(str1.toString());
		//2nd Approach
		String str2=sb1.toString();
		System.out.println(str2.toString());

	}
}
//public java.lang.String(java.lang.StringBuffer);
//public synchronized java.lang.String toString();
