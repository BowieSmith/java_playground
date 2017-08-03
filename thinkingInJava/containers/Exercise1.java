import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>(Countries.names(20));
		System.out.println(cities);
		Collections.shuffle(cities);
		System.out.println("\n\n" + cities);
	}
}