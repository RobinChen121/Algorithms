package chapter1.one;
import edu.princeton.cs.algs4.StdDraw;
public class DrawRandomPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 20; double p = Math.random();
		StdDraw.setXscale(-N, N);
		StdDraw.setYscale(-N, N);
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor();
		System.out.println(p);
		for (int i = 0; i < N; i++) {
			StdDraw.point(-N/2 + i, 0);
			if (i>0 && Math.random() < p)
				StdDraw.line(-N/2 + i-1, 0, -N/2 + i, 0);
		}

	}

}
