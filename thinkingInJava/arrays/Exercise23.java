import java.util.*;

public class Exercise23 {
	public static void main(String[] args) {
		Integer[] ia = new Integer[10];
		Random rand = new Random();
		for (int i = 0; i < ia.length; i++) {
			ia[i] = rand.nextInt(100);
		}
		for (Integer i : ia) {
			System.out.print(i + " ");
		}

		Arrays.sort(ia, Collections.reverseOrder());

		for (Integer i : ia) {
			System.out.print(i + " ");
		}
	}
}
