package chapter2;

import java.util.Arrays;

/**
*@author: Zhen Chen
*@email: 15011074486@163.com
*@date: Jul 20, 2018---6:10:24 PM
*@description:  a bubble sorting algorithm in Java
*/

public class BubbleSort {
	
	public static void sort(double[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					double temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
	}
	


	public static void main(String[] args) {
		double[] a = {8, 3, 2, 5};
		sort(a);
		System.out.println(Arrays.toString(a));

	}

}
