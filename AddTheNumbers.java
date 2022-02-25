package week1.day1;

public class AddTheNumbers {

	public static void main(String[] args) {
		int num=456;
		int sum=0,rem=0;
		
		while(num>0)
		{
		  rem=num%10;
			sum=sum+rem;
			num=num/10;
			}
			System.out.println("sum of the digits is:"+ sum );
		}
	}


