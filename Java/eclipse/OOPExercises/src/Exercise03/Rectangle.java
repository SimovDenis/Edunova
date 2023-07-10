package Exercise03;

public class Rectangle {

	private double width;
	private double height;

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(double width, double height) {
		super();
		this.height = height;
		this.width = width;
	}

	public Rectangle() {
		super();
	}
	
	protected double area() {
		return width * height;
	}
	
	protected double perimeter() {
		return 2*(width + height);
	}

}
