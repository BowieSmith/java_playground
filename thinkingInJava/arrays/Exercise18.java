public class Exercise18 {
	public static void main(String[] args) {
		BerylliumSphere[] bsa = new BerylliumSphere[7];
		Generator<BerylliumSphere> spehereGen = new Generator<BerylliumSphere>() {
			public BerylliumSphere next() {
				return new BerylliumSphere();
			}
		};
		for (int i = 0; i < bsa.length; i++) {
			bsa[i] = spehereGen.next();
		}

		for (BerylliumSphere b : bsa) {
			System.out.println(b);
		}

		BerylliumSphere[] bsa2 = new BerylliumSphere[7];
		System.arraycopy(bsa, 0, bsa2, 0, bsa.length);

		for (BerylliumSphere b : bsa2) {
			System.out.println(b);
		}
	}
}
