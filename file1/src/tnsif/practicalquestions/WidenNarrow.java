package tnsif.practicalquestions;

public class WidenNarrow {

	public static void main(String[] args) {
		byte b = 126;
		int i = b;
		System.out.println("Byte has widen into int: "+i);
		float f = 23.55f;
		short s = (short)f;
		System.out.println("Float has narrowed into short: "+s);
	}

}
