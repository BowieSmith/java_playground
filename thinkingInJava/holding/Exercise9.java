import java.util.*;

class Sequence<E> implements Iterable<E> {
	public List<E> items;
	public Sequence(int size) { items = new ArrayList<E>(size); }
	public void add(E e) {
		items.add(e);
	}
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			private int i = 0;
			public boolean hasNext() { return i < items.size(); }
			public E next() { return items.get(i++); }
			public void remove() { items.set(i - 1, null); }
		};
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		Sequence<Integer> sequence = new Sequence<>(10);
		for(int i = 0; i < 12; i++)
			sequence.add(i);
		Iterator<Integer> it = sequence.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
			it.remove();
		}
		System.out.println("\n" + sequence.items);
	}
}