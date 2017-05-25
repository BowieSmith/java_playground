import java.util.*;

class BreakingBad {
	private static String[] characters = {
		"Walter",
		"Skyler",
		"Hank",
		"Junior",
		"Sal",
		"Jesse",
		"Marie",
	};
	private static int current = 0;
	public static String next() {
		current = (current + 1) % characters.length;
		return characters[current];
	}
	public static void fillCollection(Collection c, int n) {
		for (int i = 0; i < n; i++) {
			c.add(next());
		}
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		List<String> charList = new ArrayList<String>();
		BreakingBad.fillCollection(charList, 10);
		System.out.println(charList);

		charList = new LinkedList<String>();
		BreakingBad.fillCollection(charList, 10);
		System.out.println(charList);

		Set<String> charSet = new HashSet<String>();
		BreakingBad.fillCollection(charSet, 10);
		System.out.println(charSet);

		charSet = new LinkedHashSet<String>();
		BreakingBad.fillCollection(charSet, 10);
		System.out.println(charSet);

		charSet = new TreeSet<String>();
		BreakingBad.fillCollection(charSet, 10);
		System.out.println(charSet);
	}
}