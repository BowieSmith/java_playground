import holding.Stack;

public class Exercise15 {
	public static void evaluateStackExpression(String exp) throws Exception{
		Stack<Character> charStack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		Character currentOp = null;
		int index = 0;
		while (index < exp.length()) {
			System.out.println("Current Stack: " + charStack);
			System.out.println("Current Index: " + index);
			currentOp = exp.charAt(index++);
			System.out.println("Current Operator: " + currentOp);
			if (currentOp == '+') {
				charStack.push(exp.charAt(index++));
			} else if (currentOp == '-') {
				sb.append(charStack.pop());
			} else {
				throw new Exception("Invalid Stack Expression. Terminating Evalution.");
			}
		}
		System.out.println("\n\n\tRESULT: " + sb);
	}

	public static void main(String[] args) {
		String stackExpression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		try {
			evaluateStackExpression(stackExpression);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
