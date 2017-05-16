class AlertStatus {
	void alert() {
		System.out.println("Default alert");
	}
}

class FireAlert extends AlertStatus {
	void alert() {
		System.out.println("Fire alert!");
	}
}

class DiscoAlert extends AlertStatus {
	void alert() {
		System.out.println("Disco alert!");
	}
}

class FartAlert extends AlertStatus {
	void alert() {
		System.out.println("Stink alert!");
	}
}

class Starship {
	private AlertStatus a = new AlertStatus();
	void announceAlert() {
		a.alert();
	}
	void setAlertStatus(int i) {
		switch(i) {
			case 0: a = new FireAlert(); break;
			case 1: a = new DiscoAlert(); break;
			case 2: a = new FartAlert(); break;
			default: System.out.println("Invalid alert integer code!");
		}
	}
}

public class Exercise16 {
	public static void main(String[] args) {
		Starship s = new Starship();
		s.announceAlert();
		s.setAlertStatus(0);
		s.announceAlert();
		s.setAlertStatus(1);
		s.announceAlert();
		s.setAlertStatus(2);
		s.announceAlert();
		s.setAlertStatus(3);
	}
}
