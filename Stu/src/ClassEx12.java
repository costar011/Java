class B {
	int a;
	int b;
	int hap;
	int sum() {
		hap = a + b;
		return hap;
	}
}

class C  extends B { // B의 서브 클래스 
	int x;
	int y;
}


public class ClassEx12 {

	public static void main(String[] args) {
		B ob = new B();
		
		ob.a=10;
		ob.b=20;
		
		
		System.out.println(ob.a);
		System.out.println(ob.b);
	}

}
