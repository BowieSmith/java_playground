import java.util.*;

public class Exercise12 {
	private List<Integer> intList = new ArrayList<Integer>();
	private Random rand = new Random();
	public Exercise12(int n) {
		for (int i = 0; i < n; i++) {
			intList.add(rand.nextInt(20));
		}
	}
	public ListIterator<Integer> getListIterator() {
		return intList.listIterator();
	}
	public ListIterator<Integer> getReverseListIterator() {
		return intList.listIterator(intList.size());
	}
	public static void main(String[] args) {
		Exercise12 list_1 = new Exercise12(10);
		Exercise12 list_2 = new Exercise12(10);

		System.out.println(list_1.intList);
		System.out.println(list_2.intList);

		ListIterator<Integer> list_1_it = list_1.getListIterator();
		ListIterator<Integer> list_2_it = list_2.getReverseListIterator();

		while (list_1_it.hasNext()) {
			list_2_it.previous();
			list_2_it.set(list_1_it.next());
		}

		System.out.println(list_1.intList);
		System.out.println(list_2.intList);
	}
}

