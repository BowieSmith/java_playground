class Component1 {
	Component1() {
		System.out.println("Component1() constructor");
	}
}

class Component2 {
	Component2() {
		System.out.println("Component2() constructor");
	}
}

class Component3 {
	Component3() {
		System.out.println("Component3() constructor");
	}
}

class Root {
	Component3 c3 = new Component3();
	Component2 c2 = new Component2();
	Component1 c1 = new Component1();
	Root() {
		System.out.println("Root() constructor");
	}
}

class Stem extends Root {
	Stem() {
		System.out.println("Stem() constructor");
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		Stem s = new Stem();
	}
}