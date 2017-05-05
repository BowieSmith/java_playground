public class ASCII_Table {
	public static void printAsciiValue(int n) {
		System.out.println("Value: " + n + "\tASCII Character: " + "\"" + (char)n + "\"");
	}
	public static void main(String[] args) {
		for (int i = 0; i < 128; i++) {
			printAsciiValue(i);
		}
	}
}
