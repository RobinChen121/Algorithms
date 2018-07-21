package chapter2;

import java.util.Arrays;

import umontreal.ssj.randvar.UniformIntGen;
import umontreal.ssj.rng.MRG32k3aL;
import umontreal.ssj.rng.RandomStream;

/**
*@author: Zhen Chen
*@email: 15011074486@163.com
*@date: Jul 20, 2018---8:45:51 PM
*@description:  a quick sort algorithm in Java
*/

public class QuickSort {
	
	/**
	 *  shuffle an array before sorting,
	 *  eliminate input dependent 
	 *  
	 * @param a
	 * @return
	 */
	static void shuffle(double[] a) {
		RandomStream stream = new MRG32k3aL();
		for (int i = 0; i< a.length; i++) {
			int j = UniformIntGen.nextInt(stream, 0, i);
			double temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	
	public static void sort(double[] a) {
		shuffle(a);
		quickSort(a, 0, a.length - 1);
	}
	
	static void exchange(double[] a, int i, int j) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void quickSort(double[] a, int start, int end) {
		int k = (start + end)/2;
		if (start >= end)
			return;
		else {
			// step 1
			int i = start; int j = end; double baseValue = a[k];
			
			// setp 2
			while (i < j) {
				while (a[i] < baseValue) { // until find a value that greater than baseValue
					i ++;
				}

				while (a[j] > baseValue) { // until find a value that less than baseValue
					j --;
				}				
				exchange(a, i, j); 
				if (a[i] == a[j]) // avoid endless loop
					i++;
			}
			
			// setp 3
			quickSort(a, start, j - 1);
			quickSort(a, j + 1, end);
		}
		
	}

	public static void main(String[] args) {
		double[] a = {1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
}
