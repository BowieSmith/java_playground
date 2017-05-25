import java.util.*;

class MyLinkedList {
	private List<Integer> intList = new LinkedList<Integer>();
	public void addMiddle(int n) {
		int middleIndex = intList.size() / 2;
		System.out.println("Adding " + n + " to list at index " + middleIndex);
		intList.add(middleIndex, n);
		System.out.println(intList);
	}
}

public class Exercise14 {
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			myList.addMiddle(rand.nextInt(20));
		}
	}
}
