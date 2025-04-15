package tnsif.practicalquestions;

public class Employee {
	String name = "Veda Vani";
	int age = 21;
	int salary = 50000;
	
	public int display() {
		System.out.println("Name of the Employee: "+name);
		System.out.println("Age of the Employee: "+age);
		System.out.println("Salary of the Employee: "+salary);
		return 0;
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();
	}

}
