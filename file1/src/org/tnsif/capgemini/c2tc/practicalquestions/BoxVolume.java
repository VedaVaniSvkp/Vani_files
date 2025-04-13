package org.tnsif.capgemini.c2tc.practicalquestions;

public class BoxVolume {
	int length, breadth, height;
	
	public int volume() {
		int result = length*breadth*height;
		System.out.println("Volume of box: "+result);
		return length*breadth*height;
	}
	public BoxVolume(int x, int y, int z) {
		this.length = x;
		this.breadth = y;
		this.height = z;
	}
	
	public static void main(String[] args) {
		BoxVolume box = new BoxVolume(10, 20, 30);
		box.volume();

	}

}
