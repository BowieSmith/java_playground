interface Generator<T> {
	T next();
}

class Generators {
	public static class BigDecimal implements Generator<java.math.BigDecimal> {
		private java.math.BigDecimal current = java.math.BigDecimal.ZERO;
		public java.math.BigDecimal next() {
			current = current.add(java.math.BigDecimal.ONE);
			return current;
		}
	}
}

public class Exercise17 {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		Generators.BigDecimal bd = new Generators.BigDecimal();
		for (int i = 0; i < 10000; i++) {
			System.out.println(bd.next());
		}
		while(true) {
			System.out.println("pee\npoop\nfart\nbarf\n"); 
		}
	}
}