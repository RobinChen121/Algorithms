package chapter1.one;

public class CommDivisor {
	static int commDivisor(int a, int b) {
		if (b == 0) return a;
		return commDivisor(b, a%b);
	}
	
	public static void main(String[] args) {
		int a = 100; int b = 36;
		System.out.println(commDivisor(b,a));
	}

}
