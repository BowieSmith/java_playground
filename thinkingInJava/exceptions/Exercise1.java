public class Exercise1 {
	public static void main(String[] args) {
		try {
			throw new Exception("String argument to Exception()");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("In finally clause.");
		}
	}
}
