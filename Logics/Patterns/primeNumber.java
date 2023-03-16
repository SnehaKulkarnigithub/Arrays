
public class primeNumber {

	public static void main(String[] args) {
		int cnt=0;
		for(int i=1;i<=100;i++)
		{
			for(int j=2;j<i-1;j++)
			{
				if(i%j == 0)
				{
					cnt=1;
					break;
				}
				else 
					cnt=0;
			}
			if(cnt==0)
			{
				System.out.println(i+" is Prime Number");
			}
		}
	}
}
		
