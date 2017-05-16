class MyOuter {
	class MyInner {
		MyInner() { System.out.println("MyInner() constructor"); }
	}
}

public class Exercise5 {
	public static void main(String[] args) {
		(new MyOuter()).new MyInner();
	}
}