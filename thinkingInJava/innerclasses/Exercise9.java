interface ThisInterface {
	void aMethod();
}

class ThisClass {
	ThisInterface getInterface() {
		class ImplementationClass implements ThisInterface {
			public void aMethod() {
				System.out.println("ImplementationClass.aMethod()");
			}
		}
		return new ImplementationClass();
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		new ThisClass().getInterface().aMethod();
	}
}