import java.util.*;

class MyList<T> extends ArrayList<T> {
	public MyList() {
		super();
	}
	public MyList(List<T> otherList) {
		super(otherList);
	}
	public List<T> getReversed() {
		List<T> reversedList = new ArrayList<T>(this);
		Collections.sort(reversedList, Collections.reverseOrder());
		return reversedList;
	}
}

public class Exercise25 {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<Integer>(
				Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, }));
		System.out.println("aList: " + aList);

		System.out.println("aList.getClass().getName(): " + aList.getClass().getName());

		System.out.println("aList.get(4): " + aList.get(4));

		System.out.println("aList.add(6);");
		aList.add(6);

		System.out.println("aList.addAll(Arrays.asList(new Integer[] {7, 8}));");
		aList.addAll(Arrays.asList(new Integer[] {7, 8}));

		System.out.println("aList: " + aList);

		System.out.println("List<Integer> aSlice = new ArrayList<Integer>(aList.subList(2,4));");
		List<Integer> aSlice = new ArrayList<Integer>(aList.subList(2,4));
		System.out.println("aSlice: " + aSlice);

		System.out.println("MyList<Integer> list2 = new MyList<Integer>(aList);");
		MyList<Integer> list2 = new MyList<Integer>(aList);
		
		System.out.println("list2.getClass().getName(): " + list2.getClass().getName());

		System.out.println("list2.getReversed(): " + list2.getReversed());
	}
}

