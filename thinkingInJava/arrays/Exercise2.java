import java.util.*;

public class Exercise2 {
	public static BerylliumSphere[] makeSpheres(int n) {
		BerylliumSphere[] bsa = new BerylliumSphere[n];
		for (int i = 0; i < n; i++) {
			bsa[i] = new BerylliumSphere();
		}
		return bsa;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(makeSpheres(5)));
		System.out.println(Arrays.toString(makeSpheres(5)));
		System.out.println(Arrays.toString(makeSpheres(5)));
	}
}