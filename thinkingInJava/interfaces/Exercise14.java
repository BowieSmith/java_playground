interface InterfaceOne {
	void methodOne();
	void methodTwo();
}

interface InterfaceTwo {
	void methodThree();
	void methodFour();
}

interface InterfaceThree {
	void methodFive();
	void methodSix();
}

interface ComboInterface extends InterfaceOne, InterfaceTwo, InterfaceThree {
	void methodSeven();
}

class BaseClass {}

class DerivedClass extends BaseClass implements ComboInterface {
	public void methodOne() { System.out.println("DerivedClass.methodOne()"); }
	public void methodTwo() { System.out.println("DerivedClass.methodTwo()"); }
	public void methodThree() { System.out.println("DerivedClass.methodThree()"); }
	public void methodFour() { System.out.println("DerivedClass.methodFour()"); }
	public void methodFive() { System.out.println("DerivedClass.methodFive()"); }
	public void methodSix() { System.out.println("DerivedClass.methodSix()"); }
	public void methodSeven() { System.out.println("DerivedClass.methodSeven()"); }
}

public class Exercise14 {
	public static void callOne(InterfaceOne i1) {
		i1.methodOne();
		i1.methodTwo();
	}
	public static void callTwo(InterfaceTwo i2) {
		i2.methodThree();
		i2.methodFour();
	}
	public static void callThree(InterfaceThree i3) {
		i3.methodFive();
		i3.methodSix();
	}
	public static void callFour(ComboInterface c) {
		c.methodSeven();
	}
	public static void main(String[] args) {
		DerivedClass d = new DerivedClass();
		callOne(d);
		callTwo(d);
		callThree(d);
		callFour(d);
	}
}