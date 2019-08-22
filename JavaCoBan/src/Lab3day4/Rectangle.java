package Lab3day4;

public class Rectangle extends Shape{
		private int length;
		private int width;	
	    public Rectangle(String color,int length,int width) {
		super(color);
		this.length= length;
		this.width = width;
	}

	    public double getArea() {
	        return (this.length + this.width);
	    }

	    public String toString() {
	        return "Rectangle has length = " + length + ", width = " + width + ", area = " + getArea();
	    }
	}
