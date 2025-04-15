package tnsif.practicalquestions;

public class Laptop {
	String brand;
	int price;
	
	public Laptop(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public void expensive() {
		if(price>50000) {
			System.out.println(brand+" Laptop is expensive");
		}
		else {
			System.out.println(brand+" Laptop is not expensive");
		}
	}
	
	public static void main(String[] args) {
		Laptop lap = new Laptop("Apple", 85600);
		lap.expensive();
	}

}
