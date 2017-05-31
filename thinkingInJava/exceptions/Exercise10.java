class MyExceptionOne extends Exception {}
class MyExceptionTwo extends Exception {}

class Exceptions10 {
	void f() throws MyExceptionTwo {
		try {
			g();
		} catch (MyExceptionOne meo) {
			meo.printStackTrace();
			MyExceptionTwo met = new MyExceptionTwo();
			met.initCause(meo);
			throw met;
		}
	}
	void g() throws MyExceptionOne {
		throw new MyExceptionOne();
	}
}

public class Exercise10 {
	public static void main(String[] args) throws MyExceptionTwo {
		new Exceptions10().f();
	}
}