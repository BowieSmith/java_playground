import java.util.*;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	public String toString() { return "Sphere " + id; }
}

public class Exercise1 {
	public static void takesSphereArray(BerylliumSphere[] bsa) {
		System.out.println("This array has enough room for " + bsa.length + " BerylliumSphere objects.");
		System.out.println("The objects are:\n\t" + Arrays.toString(bsa));
	}
	public static void main(String[] args) {
		takesSphereArray(new BerylliumSphere[] {
			new BerylliumSphere(),
			new BerylliumSphere(),
			new BerylliumSphere(),
		});
	}
}