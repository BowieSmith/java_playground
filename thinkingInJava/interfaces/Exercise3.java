// Example -- Why you should NOT call overriden methods in constructors!

abstract class BaseClassPrinter {
	BaseClassPrinter() {
		print();
	}
	abstract void print();
}

class DerivedPrint extends BaseClassPrinter {
	int i = 7;
	void print() {
		System.out.println("BaseClassPrinter.i = " + i);
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		DerivedPrint d = new DerivedPrint();
		d.print();
	}
}