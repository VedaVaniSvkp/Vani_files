package org.tnsif.capgemini.c2tc.StringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Initial Value");
		
		sb.append(" -Appended"); //add appends to the end
		sb.append(" -Again"); //add again to the end
		
		System.out.println(sb);
		
		sb.insert(15, "[insert]");
		
		System.out.println(sb);
		
		sb.replace(16, 27, "[repalaced]");
		
		sb.delete(2, 4);
		
		//sb.reverse();
		
		System.out.println("Final stringbuilder result: "+"  "+sb.toString());
				

	}

}
