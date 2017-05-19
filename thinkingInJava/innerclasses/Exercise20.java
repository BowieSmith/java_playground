interface InterfaceWithNested {
	void doSomething();
	class InsideInterface {
		InsideInterface() {
			System.out.println("InsideInterface() constructor");
		}
	}
}

public class Exercise20 {
	public static void main(String[] args) {
		new InterfaceWithNested() {
			public void doSomething() {
				System.out.println("Inside anonymous doSomething()");
			}
		}.doSomething();
		new InterfaceWithNested.InsideInterface();
	}
}
