interface MyObjectFactory {
	MyObject getNewObject();
}

class MyObject {
	private static long objectCount = 0;
	private long instanceNumber;
	private MyObject() {
		instanceNumber = objectCount++;
	}
	public String toString() {
		return "MyObject " + instanceNumber;
	}
	public static MyObjectFactory factory =
		new MyObjectFactory() {
			public MyObject getNewObject() {
				return new MyObject();
			}
		};
}

public class ObjectFactory {
	public static void main(String[] args) {
		System.out.println(MyObject.factory.getNewObject());
		System.out.println(MyObject.factory.getNewObject());
	}
}
