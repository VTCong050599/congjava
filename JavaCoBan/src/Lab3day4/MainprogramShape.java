package Lab3day4;

public class MainprogramShape {
	public static void main(String[] arg) {
		processShape("Rectangle");
		processShape("Triangle");
	}
	public static void processShape(String Shape) {
//		switch(Shape) {
//		case "Rectangle":
//			Rectangle();
//			break;
//		case "Triangle":
//			Triangle();
//			break;
		if (Shape == "Rectangle") {
			Rectangle();
		}
		else Triangle();
	}
	public static void Rectangle() {
		Shape rectangle = new Rectangle("Vàng",3,4);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.toString());
	}
	public static void Triangle() {
		Shape triangle = new Triangle("Cam",5,4);
		System.out.println(triangle.getArea());
		System.out.println(triangle.toString());
	}
}