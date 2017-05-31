import java.util.*;

public class Exercise20 {
	private int i;
	private long l;
	private float f;
	private double d;
	private String s;

	public Exercise20(String str) {
		Scanner scan = new Scanner(str);
		i = scan.nextInt();
		l = scan.nextLong();
		f = scan.nextFloat();
		d = scan.nextDouble();
		s = scan.next();
	}

	public String toString() {
		String value = "Exercise20() values:\ni = " + i + "\nl = " + l +
						"\nf = " + f + "\nd = " + d + "\ns = " + s;
		return value;
	}

	public static void main(String[] args) {
		System.out.println(new Exercise20("7 89 1.23 3.45 hello"));
	}
}