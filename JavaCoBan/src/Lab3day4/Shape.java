package Lab3day4;

public abstract class Shape {
	private String color;
	public Shape(String color) {
		this.color = color;
	}
	public abstract double getArea();
	public String toString() {
		return " shape has" +this.color +getArea();
	}
	
}
