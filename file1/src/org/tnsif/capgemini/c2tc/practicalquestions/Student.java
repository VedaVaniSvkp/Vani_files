package org.tnsif.capgemini.c2tc.practicalquestions;

 
public class Student {
	int eng;
	int maths;
	int science;
	public int total() {
		return eng+maths+science;
	}
	public int percentage() {
		return ((eng+maths+science)/3);
	}

	public Student(int eng, int maths, int science) {
		super();
		this.eng = eng;
		this.maths = maths;
		this.science = science;
	}
	public static void main(String[] args) {
		Student obj = new Student(90, 73, 55);
		System.out.println("Total: "+obj.total());
		System.out.println("Percentage: "+obj.percentage());
	}

}
