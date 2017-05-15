class BaseClass {
	void methodOne() {
		System.out.println("BaseClass.methodOne()");
		methodTwo();
	}
	void methodTwo() {
		System.out.println("BaseClass.methodTwo()");
	}
}

class Inherited extends BaseClass {
	void methodTwo() {
		System.out.println("Inherited.methodTwo()");
	}
}

public class Exercise10 {
	public static void main(String[] args) {
		BaseClass b = new Inherited();
		b.methodOne();
	}
}