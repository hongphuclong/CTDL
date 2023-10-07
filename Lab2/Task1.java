package Lab2;

public class Task1 {
	
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if(n==1) {
			return 1;
		}else {
			return (int) (getSn1(n-1) + Math.pow(-1, n+1)*n);
		}
	}
	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		if(n==1) {
			return n;
		}else {

			return getSn2(n-1) + giaithua(n);
		}

	}
	public static int giaithua(int n) {
		if(n==1) {
			return 1;

		}else {
			return giaithua(n-1)*n;
		}
	}
	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if(n==1) {
			return n;
			
		}else {
			return (int) (getSn3(n-1) + Math.pow(n, 2));
		}
	}
	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
		if(n==0) {
			return 1;
		}else {
			return (double) (getSn4(n-1) +1/tich(n));
		}
	}
	public static double tich(int n) {
		double s = 1;
		for(int i=1 ; i<=n; i++) {
			s *= 2*i;
		}
		return s;
	}
	public static void main(String[] args) {
		Task1 task1 = new Task1();
		System.out.println(getSn1(4));
		System.out.println(getSn2(4));
		System.out.println(getSn3(4));
		System.out.println(getSn4(4));
	}
}
