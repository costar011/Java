class Cir {
	int radius;
	public Cir(int a) {
		radius = a;
	}
	
	public Cir() {}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		CircleArray [] c = new CircleArray[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new CircleArray();
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println();
		}
	}
}