class Cycle {
	void ride() {
		System.out.println("Cycle.ride()");
	}
}

class Unicycle extends Cycle {
	void ride() {
		System.out.println("Unicycle.ride()");
	}
}

class Bicycle extends Cycle {
	void ride() {
		System.out.println("Bicycle.ride()");
	}
}

class Tricycle extends Cycle {
	void ride() {
		System.out.println("Tricycle.ride()");
	}
}

public class Exercise1 {
	public static void testRide(Cycle c) {
		c.ride();
	}
	public static void main(String[] args) {
		Tricycle t = new Tricycle();
		Bicycle b = new Bicycle();
		Unicycle u = new Unicycle();
		Cycle c = new Cycle();
		t.ride();
		b.ride();
		u.ride();
		c.ride();
		System.out.println();

		testRide(t);
		testRide(b);
		testRide(u);
		testRide(c);
	}
}
