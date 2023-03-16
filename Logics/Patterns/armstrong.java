public class armstrong {
	public static double isArmstrong(int n) {
		int temp=0, cnt=0, digit=0;
		double sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			cnt++;
		}
		temp=n;
		while(temp>0)
		{
			digit=temp%10;
			sum=sum+(Math.pow(digit, cnt));
			temp=temp/10;
		}
		return sum;
	}
	
	public static int isPalindrome(int a)
	{
		int temp=0, sum=0,r=0;
		temp=a;
		while(temp>0)
		{
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int n=1634;
		int a=1221;
		if(n==(armstrong.isArmstrong(n)))
		{
			System.out.println("The number "+n+" is Armstrong.");
		}
		else
			System.out.println("The number "+n+" is not Armstrong.");
		
		if(a == (armstrong.isPalindrome(a)))
		{
			System.out.println("The number "+a+" is Palindrome");
		}
		else
			System.out.println("The number "+a+" is not Palindrome");
	}

}
