package org.tnsif.capgemini.c2tc.finaldemo;

class Cal
{
	public final void show()
	{
		System.out.println("AI integration done by VANI");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}
class advalc extends Cal
{
	public void show()
	{
		System.out.println("AI integration done by KEERTHANA");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		advalc obj = new advalc();
		obj.show();
		obj.add(4, 5);

	}

}
