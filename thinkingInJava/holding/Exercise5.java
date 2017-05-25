import java.util.*;

public class Exercise5 {
	public static ArrayList<Integer> buildRandomIntList(int n) {
		Random rand = new Random(47);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrList.add(rand.nextInt(20));
		}
		return arrList;
	}

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> ints = buildRandomIntList(7);
		System.out.println("1: " + ints);
		ints.add(47); // Automatically resizes
		System.out.println("2: " + ints);
		System.out.println("3: " + ints.contains(15));
		ints.remove(new Integer(47)); // Remove by object
		Integer i = ints.get(2);
		System.out.println("4: " + i + " " + ints.indexOf(i));
		System.out.println("5: " + ints.indexOf(9));
		System.out.println("6: " + ints.remove(new Integer(9)));
		// Must be the exact object:
		System.out.println("7: " + ints.remove(new Integer(i)));
		System.out.println("8: " + ints);
		ints.add(3, 81); // Insert at an index
		System.out.println("9: " + ints);
		List<Integer> sub = ints.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + ints.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + ints.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(ints); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, 23); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + ints.isEmpty());
		ints.clear(); // Remove all elements
		System.out.println("19: " + ints);
		System.out.println("20: " + ints.isEmpty());
		ints.addAll(buildRandomIntList(4));
		System.out.println("21: " + ints);
		Object[] o = ints.toArray();
		System.out.println("22: " + o[3]);
		Integer[] pa = ints.toArray(new Integer[0]);
		System.out.println("23: " + pa[3]);
	}
}
