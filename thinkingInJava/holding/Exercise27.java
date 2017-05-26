import java.util.*;

class Command {
	private String str;
	public Command(String str) { this.str = str; }
	public void operation() { System.out.println(str); }
}

class CommandQueueUtils {
	public static Queue<Command> makeQueue(Command... args) {
		Queue<Command> q = new LinkedList<Command>();
		for (Command t : args) {
			q.add(t);
		}
		return q;
	}
}

class CommandQueueOperations {
	public static void consumeQueue(Queue<Command> q) {
		for (Command c : q) {
			c.operation();
		}
	}
}

public class Exercise27 {
	public static void main(String[] args) {
		CommandQueueOperations.consumeQueue(
			CommandQueueUtils.makeQueue(
				new Command("Command 1"),
				new Command("Command 2"),
				new Command("Command 3"),
				new Command("Command 4")));
	}
}
