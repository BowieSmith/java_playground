import java.util.*;

class Building {}
class House extends Building {}
class Rancher extends House {}

class ClassTypeCapture {
	
	Map<String,Class<?>> classMap = new HashMap<>();

	void addType(String typeName, Class<?> type) {
		classMap.put(typeName, type);
	}

	Object createNew(String typeName) throws Exception {
		if (classMap.containsKey(typeName)) {
			return classMap.get(typeName).newInstance();
		} else {
			throw new RuntimeException("Class " + typeName + " is not available.");
		}
	}
	
}

public class Exercise21 {
	public static void main(String[] args) throws Exception {
		ClassTypeCapture ctc = new ClassTypeCapture();
		ctc.addType("Building", Building.class);

		Building bldg = (Building)ctc.createNew("Building");
		System.out.println(bldg.getClass().getName());

		ctc.addType("Rancher", Rancher.class);
		System.out.println(((Rancher)ctc.createNew("Rancher")).getClass().getName());

		// Prove that java.lang.String is available to run time
		System.out.println(String.class.newInstance().getClass().getName());

		// Show that java.lang.String is NOT available to ClassTypeCapture.createNew()
		System.out.println(((String)ctc.createNew("java.lang.String")).getClass().getName());
	}
}
