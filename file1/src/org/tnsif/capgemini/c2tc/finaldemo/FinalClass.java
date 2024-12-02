package org.tnsif.capgemini.c2tc.finaldemo;

 final class calc
{
	public void show()
	{
		System.out.println("AI integration done by Bindu");
	}
}
class adav extends calc
{
	public void show()
	{
		System.out.println("AI integration done by Vani");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		calc obj = new calc();
		obj.show();

	}

}
