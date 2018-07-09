package chapter1.one;
import edu.princeton.cs.algs4.StdIn;

public class Lg {
	
	static int lg(int n) {
		int num = 0;
		for (int i = n; i > 1; i = i/2) {
			num++;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lg(StdIn.readInt()));

	}

}
