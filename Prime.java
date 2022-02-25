package week1.day1;

public class Prime {

	public static void main(String[] args) {
		int i, n=13;
		boolean a=false;
		
			for(i=2;i<=n/2;i++) {
				if(n%i==0) {
					a=true;
					break;
			}
		}
if(!a)
	System.out.println(n+ " is a prime number.");
else
	System.out.println(n+ " is not a prime number.");
	}

}
