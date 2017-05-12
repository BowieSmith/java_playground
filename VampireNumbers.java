public class VampireNumbers {
	public static boolean isVampireNumber(int n) {
		int numberOfDigits = Math.floor(Math.log10(n)) + 1;
		if (numberOfDigits % 2 != 0) {
			return false;
		}
	}

	public static int fourDigitsToVampireProduct(int a, int b, int c, int d) {
		int temp1 = 10 * a + b;
		int temp2 = 10 * c + d;
		return temp1 * temp2;
	}
}

1 2 3 4

12 * 34
12 * 43
21 * 34
21 * 43

13 * 24
13 * 43
31 * 24
31 * 42

14 * 23
14 * 32
41 * 23
31 * 32
