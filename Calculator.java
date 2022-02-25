package week1.day2;

public class Calculator {
public static void main(String[] args) {

	
		Calculator cal=new Calculator();
		cal.add();
		cal.minus();
		cal.mul();
		cal.div();
	}
	
	public void add() {
		int a=10,b=5,c=2,sum;
		sum=a+b+c;
		System.out.println("Addition of 3 number is :" +sum);
	}
     public void minus()
     {
    	 int a=10,b=5,c=2,sub;
    	 sub=a-b-c;
    	 System.out.println("Subtraction of 3 number is: " +sub);
     }
     public void mul()
     {
    	 int multiply,a=10,b=5,c=2;
    	 multiply=a*b*c;
    	 System.out.println("Multiplication of 3 number is: " +multiply);
     }
     public void div()
     {
    	 int divide, a=10,b=5;
    	 divide=a/b;
    	 System.out.println("Division of 2 number is " +divide);
}
	

}
