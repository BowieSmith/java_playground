class Outer {
	class Inner {
		public int i;
		public Inner(int i) {
			this.i = i;
			System.out.println("Inner(" + i + ") constructed");
		}
	}
	public Inner returnInner(int i) {
		return new Inner(i);
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Outer.Inner i = new Outer().returnInner(7);
	}
}