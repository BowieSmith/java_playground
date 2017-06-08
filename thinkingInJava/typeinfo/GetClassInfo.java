import java.lang.reflect.*;

public class GetClassInfo {
	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				System.out.println("Usage:\njava GetClassInfo qualified.class.Name");
			} else {
				Class<?> c = Class.forName(args[0]);
				System.out.println("\tCanonical Name: " + c.getCanonicalName());
				System.out.println("\tClass loader: " + c.getClassLoader());
				System.out.println("\tFields:");
				for (Field f : c.getFields()) {
					System.out.println("\t\t" + f);
				}
				System.out.println("\tMethods:");
				for (Method m : c.getMethods()) {
					System.out.println("\t\t" + m);
				}
				System.out.println("\tConstructors:");
				for (Constructor<?> con : c.getConstructors()) {
					System.out.println("\t\t" + con);
				}
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}