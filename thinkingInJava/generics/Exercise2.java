import java.util.*;

class HoldThreeObj<T> {
	private List<T> objList = new ArrayList<T>(3);
	public HoldThreeObj(T t1, T t2, T t3) {
		objList.add(t1);
		objList.add(t2);
		objList.add(t3);
	}
	public void setObj(int index, T obj) {
		if (index < 0 || index > 2) {
			throw new RuntimeException("HoldThreeObj.setObj(index,obj) index value " +
					"out of range. Can only take index value: 0,1,2");
		}
		objList.set(index, obj);
	}
	public T getObj(int index) {
		if (index < 0 || index > 2) {
			throw new RuntimeException("HoldThreeObj.getObj(index) index value " +
					"out of range. Can only take index value: 0,1,2");
		}
		return objList.get(index);
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		HoldThreeObj<String> stringContainer = new HoldThreeObj<>("Hello","World","Howudo?");
		for (int i = 0; i < 3; i++) {
			System.out.println(stringContainer.getObj(i));
		}
	}
}
