import java.util.*;

public class Exercise27 {
	public static void main(String[] args) {
		// Will not compile. Incompatible types.
		// List<Number> numList = new ArrayList<Integer>();
		List<Number> numList = new ArrayList<Number>();
		numList.add(7);
		numList.add(8);
		numList.add(9);

		// Will not compile. Incompatible types.
		// List<Integer> intList = numList;

		List<? extends Number> intList = numList;

		for (Number n : intList) {
			System.out.println(n);
		}
	}
}