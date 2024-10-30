package basic;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=7, b=24, c=15;
		
		//logical AND
		
		System.out.println("(a>b) && (b>c) condition is "+((a>b) && (b>c)));
		
		//logical OR
		
		System.out.println("(a>b) || (b>c) condition is "+((a>b) || (b>c)));
		
		//logical NOT
		
		System.out.println("!(a==b) condition is "+!(a==b));

	}

}
