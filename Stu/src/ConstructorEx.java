class X {
	public X() {
		System.out.println("생성자 A");
	}
}
class Y extends X {
	public Y() {
		System.out.println("생성자 B");
	}
}

class Z extends Y {
	public Z() {
		System.out.println("생성자 C");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		Z z;
		z = new Z();

	}

}
