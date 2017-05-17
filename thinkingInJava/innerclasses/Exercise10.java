interface ThisInterface {
	void aMethod();
}

class ThisClass {
	ThisInterface getInterface(boolean b) {
		if(b) {
			class ImplementationClass implements ThisInterface {
				public void aMethod() {
					System.out.println("ImplementationClass.aMethod()");
				}
			}
			return new ImplementationClass();
		}
		return null;
	}
}

public class Exercise10 {
	public static void main(String[] args) {
		new ThisClass().getInterface(true).aMethod();
	}
}