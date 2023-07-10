package Exercise02;

public class Start {
	
//	Write a Java program to create a class called "Dog" with a name and breed attribute. 
//	Create two instances of the "Dog" class, 
//	set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Kia", "Argentinian doga");
		Dog dog2 = new Dog("Ron", "German shepard");
		
		dog1.setBreed("Chihuahua");
		dog2.setName("Rex");
		
		System.out.println(dog2.getName());	
		System.out.println(dog1.getBreed());
		
	}
	
	
	
	

}
