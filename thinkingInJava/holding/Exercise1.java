import java.util.*;

class Gerbil {
	private static int count = 0;
	private final int gerbilNumber = count++;
	public void hop() {
		System.out.println("Gerbil " + gerbilNumber + " is hopping");
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		List<Gerbil> gerbilList = new ArrayList<Gerbil>();
		for (int i = 0; i < 5; i++) {
			gerbilList.add(new Gerbil());
		}
		for (Gerbil g : gerbilList) {
			g.hop();
		}
	}
}