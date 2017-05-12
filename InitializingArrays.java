public class InitializingArrays {
	public static void main(String[] args) {
		Tester[] testerArray = new Tester[] {
			new Tester("one"),
			new Tester("two"),
			new Tester("three"),
			new Tester("four"),
		};

		Tester.printStrings("hello","world","blardy","blar");
		Tester.printStrings(new String[]{"loop","de","doo"});
	}
}

class Tester {
	Tester(String str) {
		System.out.println(str);
	}

	static void printStrings(String... args) {
		for (String s : args) {
			System.out.println(s);
		}
	}
}
