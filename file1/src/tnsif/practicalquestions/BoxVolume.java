package tnsif.practicalquestions;

public class BoxVolume {
	int length, breadth, height;
	
	public int volume() {
		int result = length*breadth*height;
		System.out.println("Volume of box: "+result);
		return length*breadth*height;
	}
	public BoxVolume(int len, int bre, int hei) {
		this.length = len;
		this.breadth = bre;
		this.height = hei;
	}
	
	public static void main(String[] args) {
		BoxVolume box = new BoxVolume(10, 20, 30);
		box.volume();

	}

}
