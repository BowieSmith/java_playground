public class Exercise6 {
	private int myInt;
	private long myLong;
	private float myFloat;
	private double myDouble;

	public Exercise6(int i, long l, float f, double d) {
		myInt = i;
		myLong = l;
		myFloat = f;
		myDouble = d;
	}

	public String toString() {
		return String.format("Exercise6():\nmyInt: %d,\nmyLong: %d,\nmyFloat: %f,\nmyDouble: %f",
								myInt, myLong, myFloat, myDouble);
	}

	public static void main(String[] args) {
		System.out.println(new Exercise6(7, 89, 3.7F, 8.9));
	}
}