interface AnInterface {
	void doSomething();
}

class AClass {
	AnInterface returnInterface() {
		return new AnInterface() {
			public void doSomething() {
				System.out.println("Anonymous doSomething()");
			}
		};
	}
}

public class Exercise13 {
	public static void main(String[] args) {
		new AClass().returnInterface().doSomething();
	}
}