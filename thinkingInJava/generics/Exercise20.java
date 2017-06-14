interface MyInterface {
	void methodOne();
	void methodTwo();
}

class MyClass implements MyInterface {
	public void methodOne() { System.out.println("MyClass.methodOne()"); }
	public void methodTwo() { System.out.println("MyClass.methodTwo()"); }
	public void methodThree() { System.out.println("MyClass.methodThree()"); }
}

class OtherClass {
	public <T extends MyInterface> void genericMethod(T t) {
		t.methodOne();
		t.methodTwo();
	}
}

public class Exercise20 {
	public static void main(String[] args) {
		new OtherClass().genericMethod(new MyClass());
	}
}