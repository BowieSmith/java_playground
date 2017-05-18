class ContainsNested {
	static class Nested {
		public String toString() {
			return "ContainsNested.Nested";
		}
	}
}

public class Exercise18 {
	public static void main(String[] args) {
		System.out.println(new ContainsNested.Nested());
	}
}
