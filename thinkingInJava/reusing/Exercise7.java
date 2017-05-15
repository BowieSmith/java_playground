class A {
	A(int i) {
		System.out.println("A(" + i + ") constructor");
	}
}

class B {
	B(int i) {
		System.out.println("B(" + i + ") constructor");
	}
}

class C extends A {
	B b;
	C(int i) {
		super(i);
		b = new B(7);
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		C c = new C(3);
	}
}