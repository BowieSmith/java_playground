public class Exercise3 {
	public static void main(String[] args) {
		int[] intArray = new int[] { 1,2,3,4,5 };

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(intArray[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
