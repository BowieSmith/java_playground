import java.util.*;

public class Exercise28 {
	public static void main(String[] args) {
		Random rand = new Random();
		Queue<Double> dq = new PriorityQueue<Double>();
		System.out.println("Order of elements added to PriorityQueue:");
		for (int i = 0; i < 10; i++) {
			Double d = rand.nextDouble() * 100;
			System.out.println(d);
			dq.offer(d);
		}
		System.out.println("\nOrder of elements stored in PriorityQueue via for-each traverse:");
		for (Double d : dq) {
			System.out.println(d);
		}
		System.out.println("\nOrder of elements pulled from PriorityQueue via poll():");
		while (!dq.isEmpty()) {
			System.out.println(dq.poll());
		}
	}
}
