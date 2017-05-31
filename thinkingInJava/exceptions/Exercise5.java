public class Exercise5 {
	public static void main(String[] args) {
		int thisInt = 3;
		while(thisInt > 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println();
				thisInt--;
			}
		}
	}
}