class StaticSample1 {
	public int n;
	public void g() {
		m = 20;
	}
	

	public void h() {
		m = 30;
	}
	
	public static int m;
	
	public static void f() {
		m = 5;
	}
}


public class Ex1_1 {

	public static void main(String[] args) {
		StaticSample1.m = 10;
		
		StaticSample1 s1;
		s1 = new StaticSample1();
		System.out.println(s1.m);
		s1.f();
		StaticSample1.f();
	}

}
