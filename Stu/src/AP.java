class A {
	int su;
	int ar[] = new int[3];
	int index = 0;
	
	A() {
		su = 20;
		ar[0] = 10;
		ar[1] = 10;
	    ar[2] = 20;
	}
	
	A(int x, int b[]) {
		su = x;
		ar = b;
	}
	
	void Pr() {
		System.out.println("su " + su);
		System.out.println("ar[0]" + ar[0] + "ar[1]" + ar[1] + "ar[2]" + ar[2]);
	}
	
	void indexAr(int data) {
		ar[index] = data;
		index ++;
	}
	
	public static class D0407 {
		public static void main(String[] args) {
			A ob1 = new A();
			ob1.Pr();
			
			int inAr[] =  {1,2,3};
			A ob2 = new A(100, inAr);
			ob2.Pr();
			
			
			ob1.indexAr(30);
			ob1.indexAr(50);
			
			System.out.println(ob1.ar[0]);
			System.out.println(ob1.ar[1]);
		}
	}
}