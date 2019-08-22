package Lab3day4;

public class Triangle extends Shape {
	private int base;
	private int height;
	public Triangle(String color,int base,int height) {
		super(color);
		this.base	= base;
		this.height = height;
	}
	public double getArea() {
		return (this.base*this.height*0.5);
	}
	public String toString() {
		return "Triangle has base = " + base + ", height = " + height + ", area = " + getArea();
	}
}
