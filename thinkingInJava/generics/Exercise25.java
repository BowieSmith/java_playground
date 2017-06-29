interface MyInterfaceOne {
	void myMethodOne();
}

interface MyInterfaceTwo {
	void myMethodTwo();
}

class ImplementBoth implements MyInterfaceOne, MyInterfaceTwo {
	public void myMethodOne() {
		System.out.println("ImplementBoth.myMethodOne()");
	}
	public void myMethodTwo() {
		System.out.println("ImplementBoth.myMethodTwo()");
	}
}

public class Exercise25 {
	static <T extends MyInterfaceOne> void actOnMyInterfaceOne(T t) {
		System.out.println("Inside Exercise25.actOnMyInterfaceOne()");
		t.myMethodOne();
	}
	static <T extends MyInterfaceTwo> void actOnMyInterfaceTwo(T t) {
		System.out.println("Inside Exercise25.actOnMyInterfaceTwo()");
		t.myMethodTwo();
	}
	public static void main(String[] args) {
		ImplementBoth ib = new ImplementBoth();
		 actOnMyInterfaceOne(ib);
		 actOnMyInterfaceTwo(ib);
	}
}