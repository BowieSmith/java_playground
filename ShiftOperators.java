public class ShiftOperators {
	public static void main(String[] args) {
		int a = 0xff;
		shiftRightPrint(a);
	}

	public static void shiftRightPrint(int n) {
		int lengthOfBinaryInt = Integer.toBinaryString(n).length();
		
		for (int i = 0; i < lengthOfBinaryInt; i++) {
			System.out.println("Int Value: " + n);
			System.out.println("Binary Representation: " + Integer.toBinaryString(n) + "\n");
			n = n >> 1;
		}
	}
}
