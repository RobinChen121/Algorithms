package chapter1.one;
import java.util.Arrays;
import java.util.Scanner;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
	
	static int rank(int key, int[] arr) {
		int low = 0;
		int up = arr.length - 1;
		while (up - low >= 0)
		{
			int mid = (up + low)/2;
			if (key > arr[mid]) 
				low = mid + 1; 
			else if (key < arr[mid])
				up = mid - 1; 
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		Arrays.sort(arr);
		Scanner s = new Scanner(System.in);
		while (!s.hasNext("")){
			int key = s.nextInt();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
			if (rank(key, arr) < 0)
				StdOut.println(key);
		}		
		s.close();
	}
}
