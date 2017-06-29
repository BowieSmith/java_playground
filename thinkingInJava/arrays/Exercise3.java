import java.util.*;

public class Exercise3 {
	public static double[][] create2Ddouble(int rows, int columns, double lowerBound, double upperBound) {
		Random rand = new Random();
		double[][] da = new double[rows][columns];
		for (int i = 0; i < da.length; i++) {
			for (int j = 0; j < da[i].length; j++) {
				da[i][j] = rand.nextDouble() * (upperBound - lowerBound) + lowerBound;
			}
		}
		return da;
	}
	public static void print2Ddouble(double[][] da) {
		System.out.println(Arrays.deepToString(da));
	}
	public static void main(String[] args) {
		print2Ddouble(create2Ddouble(2,2,5,10));
	}
}