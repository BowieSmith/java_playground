import java.util.*;

public class SystemStats {
	public static void main(String[] args) {
		System.out.println("Current Date: " + (new Date()));
		System.out.println("System.currentTimeMillis(): " + System.currentTimeMillis());
		System.out.println("System.nanoTime(): " + System.nanoTime());
		System.out.println("System.getProperty(\"user.name\"): " + System.getProperty("user.name"));
		System.out.println("System.getProperty(\"java.library.path\"): " + System.getProperty("java.library.path"));
		System.out.println("System.getProperties().list(System.out):");
	   	System.getProperties().list(System.out);
	}
}
