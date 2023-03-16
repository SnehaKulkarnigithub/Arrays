
public class Sample4 {

	public static void main(String[] args) {
		
		String str1="The Current session is based on Core Java.";
		System.out.println(str1);
		System.out.println("------------------------------------");
		String[] arr1=str1.split(" ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}

	}

}
