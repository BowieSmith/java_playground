public class ConnectionManager {
	private static Connection[] connections = new Connection[]{
		new Connection("one"),
		new Connection("two"),
		new Connection("three"),
		new Connection("four"),
		new Connection("five"),
	};
	private static int count = 0;

	public static Connection getConnection() {
		if (count < 5) {
			return connections[count++];
		} else {
			return null;
		}
	}

	public static void resetConnections() {
		count = 0;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			Object o = getConnection();
			if (o != null)
			{
				Connection c = (Connection)o;
				c.someMethod();
			} else {
				System.out.println("You do not have a connection!");
			}
		}
	}

	private static class Connection {
		private String str;
		public Connection(String str) {
			this.str = str;
			System.out.println("Connection(" + str + ") created.");
		}
		public void someMethod() {
			System.out.println("someMethod() on Connection(" + str + ")");
		}
	}
}
