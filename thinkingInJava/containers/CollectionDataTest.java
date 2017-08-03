import java.util.*;
import generics.Generator;
import containers.CollectionData;

public class CollectionDataTest {
	static class Government implements Generator<String> {
		String[] foundation = ("strange women lying in ponds distributing swords " +
			"is no basis for a system of government").split(" ");
		private int index;
		public String next() { return foundation[index++]; }
	}
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(
			new CollectionData<String>(new Government(), 15));
		System.out.println(set);
	}
}