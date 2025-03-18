package codechallenges;

class Arithmetic{
	int add(int a, int b) {
		return a+b;
	}
}

class Adder extends Arithmetic{
	
}

public class Adding {

	public static void main(String[] args) {
		Adder adder = new Adder();
		System.out.println("My Superclass is: "+adder.getClass().getSuperclass().getName());
		System.out.println(adder.add(10, 32)+" "+adder.add(10, 3)+" "+adder.add(10, 10));

	}

}
