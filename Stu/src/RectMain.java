import java.util.Scanner;

class Rect {
	int width;
	int height;
	
	int garo;
	int sero;
	
	public int getArea() {
		return width * height;
	}
}

public class RectMain {
	public static void main(String[] args) {
		Rect rect = new Rect();
		Scanner sc = new Scanner(System.in);
		System.out.println(">> ");
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.println();
	}
}