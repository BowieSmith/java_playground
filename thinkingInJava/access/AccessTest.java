package access;

public class AccessTest {
	private int priInt = 1;
	int packageInt = 2;
	protected int proInt = 3;
	public int pubInt = 4;

	private int priGetInt() { return 1; }
	int packageGetInt() { return 2; }
	protected int proGetInt() { return 3; }
	public int pubGetInt() { return 4; }

	public static void main(String[] args) {
		new TestAccess();

		AccessTest at = new AccessTest();
		System.out.println(at.priInt);
		System.out.println(at.packageInt);
		System.out.println(at.proInt);
		System.out.println(at.pubInt);

		System.out.println(at.priGetInt());
		System.out.println(at.packageGetInt());
		System.out.println(at.proGetInt());
		System.out.println(at.pubGetInt());
	}
}

class TestAccess {
	TestAccess() {
		AccessTest at = new AccessTest();

//		Cannot access private variables, but may access package, protected, and public
//		System.out.println(at.priInt);
		System.out.println(at.packageInt);
		System.out.println(at.proInt);
		System.out.println(at.pubInt);

//		System.out.println(at.priGetInt());
		System.out.println(at.packageGetInt());
		System.out.println(at.proGetInt());
		System.out.println(at.pubGetInt());
	}
}
