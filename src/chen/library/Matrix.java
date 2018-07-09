package chen.library;

public class Matrix {
	/**
     * Dot two 1D arrays.
     *
     * @return an array from standard input as a {@code double[], double[]}
     */
	public static double dot(double[] a, double[] b) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i]*b[i];
		}
		return sum;
	}
	
   /**
     * Mult two 2D arrays.
     * @param a 2D array
     * @param b 2D array
     * @return an 2D array
     */
	public static double[][] mult(double[][] a, double[][] b){
		int rowL = a.length;
		int columnL = a[0].length;
		double[][] temp = new double[rowL][columnL];
		
		for (int i = 0; i< rowL; i++) 
			for (int j = 0; j< columnL; j++)
				for (int k = 0; k< columnL; k++)
					temp[i][j] += a[i][k] * b[k][j]; 		
		return temp;
	}
	
	public static double[][] transpose(double[][] a) {
		double[][] temp = new double[a.length][a[0].length];
		for (int i = 0; i< a.length; i++) 
			for (int j = 0; j< a[0].length; j++)
				temp[i][j] = a[j][i];
		return temp;
	}
	
	public static double[] mult(double[][] a, double[] x) {
		double[] temp = new double[x.length];
		for (int i = 0; i < temp.length; i++) 
			for (int k = 0; k < temp.length; k++)
				temp[i] += a[i][k] * x[k];
		return temp;
	}
	
	public static double[] mult(double[] x, double[][] a) {
		double[] temp = new double[x.length];
		for (int i = 0; i < temp.length; i++) 
			for (int k = 0; k < temp.length; k++)
				temp[i] +=  x[k] * a[k][i] ;
		return temp;
	}
	
}
