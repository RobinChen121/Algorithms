package chapter1.one;
import java.util.ArrayList;
import java.util.Scanner;

public class OutputTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<>();
		ArrayList<ArrayList<Double>> arr = new ArrayList<>();
		while (!s.hasNext("quit")) {
			str.add(s.next());
			System.out.println(str.toString());
			ArrayList<Double> seedArr = new ArrayList<>();
			seedArr.add(s.nextDouble());seedArr.add(s.nextDouble());
			arr.add(seedArr);
			arr.toArray();
			System.out.println(arr.toString());
			
		}
		s.close();
	}

}
