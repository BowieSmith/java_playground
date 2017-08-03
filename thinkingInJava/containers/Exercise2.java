import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		Map<String,String> countryCapitalsA = new HashMap<String,String>();
		Set<String> countriesA = new HashSet<String>();

		for (Map.Entry<String,String> e : Countries.capitals().entrySet()) {
			if (Character.toLowerCase(e.getKey().charAt(0)) == 'a') {
				countryCapitalsA.put(e.getKey(), e.getValue());
				countriesA.add(e.getKey());
			}
		}

		System.out.println(countryCapitalsA);
		System.out.println();
		System.out.println(countriesA);
	}
}