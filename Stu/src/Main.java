public class Main {
	
	public static int sum(int a,  int b) {
		return(a+b);
	}
	
	public static int sum1(int s, int d, int f, int g) {
		return(s+d+f+g);
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int re = sum(x,y);
		
		System.out.println(x + "+" + y + "=" + re);
		
		x = 30;
		y = 50;
		re = sum(x, y);
		System.out.println(x + "+" + y + "=" + re);
		
		int q = 20;
		int w = 30;
		int e = 40;
		int r = 50;
		
		int hap = sum1(q,w,e,r);
		System.out.println(q + "+" + w + "+" + e + "+" + r + "=" + hap);
		
		q = 10;
		w = 20;
		e = 30;
		r = 40;
		hap = sum1(q,w,e,r);
		System.out.println(q + "+" + w + "+" + e + "+" + r + "=" + hap);
	}

}
