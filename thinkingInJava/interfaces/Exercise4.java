// Without abstract methods in base class, methods receiving a base class
// argument must be downcast to call methods.

abstract class AbstractNoMethods {}

class DerivedWithMethods extends AbstractNoMethods {
	void aMethod() {
		System.out.println("DerivedWithMethods.aMethod()");
	}
	static void downcastCall(AbstractNoMethods a) {
		((DerivedWithMethods)a).aMethod();
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		DerivedWithMethods.downcastCall(new DerivedWithMethods());
	}
}