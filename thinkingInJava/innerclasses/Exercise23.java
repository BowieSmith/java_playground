interface U {
	void methodOne();
	void methodTwo();
	void methodThree();
}

class A {
	private static int count = 0;
	U buildU() {
		return new U() {
			private int id = count++;
			public void methodOne() { System.out.println("Anonymous " + id + " methodOne()"); }
			public void methodTwo() { System.out.println("Anonymous " + id + " methodTwo()"); }
			public void methodThree() { System.out.println("Anonymous " + id + " methodThree()"); }
		};
	}
}

class B {
	U[] uarray = new U[5];
	void storeU(int index, U u) {
		uarray[index] = u;
	}
	void setNull(int index) {
		uarray[index] = null;
	}
	void callMethodsForAllU() {
		for (U u : uarray) {
			if (u != null) {
				u.methodOne();
				u.methodTwo();
				u.methodThree();
			}
		}
		
	}
}

public class Exercise23 {
	public static void main(String[] args) {
		A[] aArray = {
			new A(),
			new A(),
			new A(),
			new A(),
			new A(),
		};
		B b = new B();
		for (int i = 0; i < aArray.length; i++) {
			b.storeU(i, aArray[i].buildU());
		}
		b.callMethodsForAllU();

		for (int i = 0; i < aArray.length; i++) {
			b.setNull(i);
		}

		for (int i = 0; i < aArray.length; i++) {
			b.storeU(i, aArray[i].buildU());
		}
		b.callMethodsForAllU();
	}
}
