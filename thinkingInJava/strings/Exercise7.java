public class Exercise7 {
	public static void isSentence(String str) {
		System.out.println(str.matches("^[A-Z].*\\.$"));
	}
	public static void main(String[] args) {
		isSentence("Hello.");
		isSentence("Hello");
		isSentence("hello.");
	}
}