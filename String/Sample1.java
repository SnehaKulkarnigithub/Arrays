
public class Sample1 {

	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		// 1st Approach
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("--------------------------------");
		// 2nd Approach
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("--------------------------------");
		
		String[] b=new String[3];
		b[0]="A";
		b[1]="B";
		b[2]="C";
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
