package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		int i=-40,j;
		if(i<0) {
			j=i-i-i;
			System.out.println(j+ " is the positive number of " +i);
		}
		else
			System.out.println(i+ " number is already a positive number");
	}

}
