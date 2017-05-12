public class IntegralExperiments {
	public static void main(String[] args) {
		// Display integral values of lower case letters
		for (int letterInt = 'a'; letterInt <= 'z'; letterInt++)
		{
			System.out.println(letterInt);
		}

		displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
	}

	public static void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
		System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, max);
	}
}
