import java.util.*;

abstract class Shape {
	private boolean highlighted = false;
	public void setHighlight(boolean b) {
		highlighted = b;
	}
	public boolean getHighlight() {
		return highlighted;
	}
	void draw() { System.out.println(this + ".draw()"); }
	abstract public String toString();
}

class Circle extends Shape {
	public String toString() { return "Circle"; }
}

class Square extends Shape {
	public String toString() { return "Square"; }
}

class Triangle extends Shape {
	public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
	public String toString() { return "Rhomboid"; }
}

public class Shapes {
	public static void highlightAll(List<Shape> ls, Class shapeClass) throws Exception {
		for (Shape s : ls) {
			if (s.getClass() == shapeClass) {
				s.setHighlight(true);
			}
		}
	}
	public static void rotate(Shape s) {
		if (s instanceof Circle) {
			System.out.println("Do not rotate circle");
		} else {
			System.out.println("Rotate " + s);
		}
	}
	public static void main(String[] args) throws Exception {
		List<Shape> shapeList = Arrays.asList(
			new Circle(), new Square(), new Triangle(), new Rhomboid());

		highlightAll(shapeList, Class.forName("Triangle"));

		for(Shape shape : shapeList) {
			shape.draw();
			rotate(shape);
			System.out.println("Highlighted: " + shape.getHighlight() + "\n");
		}

		Shape r = new Circle();
		if (r instanceof Rhomboid) {
			System.out.println("r is an instance of Rhomoid");
		} else {
			System.out.println("r is not an instance of Rhomboid");
		}
	}
}