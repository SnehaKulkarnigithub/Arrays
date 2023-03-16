class Demo3 {

	public static void main(String[] args) {
		System.out.println("Start");
		String str1="Cyber";
		String str2="Success";
		String str3="Cyber";
		System.out.println(str1==str2);
		System.out.println(str2==str3);              //== operator compares references of string class
		System.out.println(str3==str1);
		System.out.println("=================");
		String str11=new String("Cyber");
		String str22=new String("Success");
		String str33=new String("Cyber");
		System.out.println(str11==str22);
		System.out.println(str22==str33);     //== operator compares references of string class
		System.out.println(str33==str11);
		System.out.println("Stop");

	}

}
