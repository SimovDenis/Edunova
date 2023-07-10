package Exercise03;

public class Start {

//	Write a Java program to create a class called "Rectangle" with width and height attributes. 
//	Calculate the area and perimeter of the rectangle.

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(6, 4);

		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());

	}

}
