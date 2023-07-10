package Exercise01;

public class Start {

	public static void main(String[] args) {

		// Write a Java program to create a class called "Person" with a name and age
		// attribute.
		// Create two instances of the "Person" class, set their attributes using the
		// constructor, and print their name and age.

		Person male = new Person("Ivan", 22);
		Person female = new Person("Anja", 20);

		System.out.println(male.getName() + " is " + male.getAge() + " years old.");
		System.out.println(female.getName() + " is " + female.getAge() + " years old.");

	}

}
