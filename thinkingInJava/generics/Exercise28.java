class Pet {}
class Cat extends Pet {}

class Generic1<T> {
	void methodOne(T t) {
		System.out.println("Generic1<T>.methodOne()");
	}
}

class Generic2<T> {
	T t;
	Generic2(T t) {
		this.t = t;
	}
	T methodTwo() {
		return t;
	}
}

class GenericMethods {
	static <T> void contravariantArg(Generic1<? super T> generic1, T t) {
		generic1.methodOne(t);
	}
	static <T> T covariantArg(Generic2<? extends T> generic2) {
		return generic2.methodTwo();
	}
}

public class Exercise28 {
	public static void main(String[] args) {
		GenericMethods.contravariantArg(new Generic1<Pet>(), new Cat());
		System.out.println(GenericMethods.covariantArg(new Generic2<Pet>(new Pet())).getClass().getName());
	}
}