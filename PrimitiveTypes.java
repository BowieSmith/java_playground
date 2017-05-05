public class PrimitiveTypes {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		int bigger = big * 4; // Overflow
		int a = 7;
	
		System.out.println(big);
		printIntBinary(big);
		System.out.println(bigger);
		printIntBinary(bigger);
		System.out.println(a);
		printIntBinary(a);
	}

	public static void printIntBinary(int n) {
		StringBuilder sb = new StringBuilder();
		String intBinaryStr = Integer.toBinaryString(n);
		int count = 0;
		for (int i = intBinaryStr.length() - 1; i >= 0; i--) {
			count++;
			sb.insert(0, intBinaryStr.charAt(i));
			if ((count % 8 == 0) && (i != 0)) {
				sb.insert(0, ' ');
			}
		}
		for (int i = 0; i < ((8 - (intBinaryStr.length() % 8)) % 8); i++) {
			sb.insert(0, 0);
		}
		System.out.println(sb);
	}
}
