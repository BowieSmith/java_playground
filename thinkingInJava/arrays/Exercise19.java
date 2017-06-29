import java.util.*;

class IntClass {
	private int thisInt;
	public IntClass(int i) {
		thisInt = i;
	}
	public int getInt() {
		return thisInt;
	}
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		} else if (other == null) {
			return false;
		} else {
			IntClass otherIntClass = (IntClass)other;
			return thisInt == otherIntClass.getInt();
		}
	}
}

public class Exercise19 {
	public static void main(String[] args) {
		IntClass[] ica1 = new IntClass[7];
		IntClass[] ica2 = new IntClass[7];
		Arrays.fill(ica1, new IntClass(7));
		Arrays.fill(ica2, new IntClass(7));

		System.out.println(Arrays.equals(ica1, ica2));
	}
}
