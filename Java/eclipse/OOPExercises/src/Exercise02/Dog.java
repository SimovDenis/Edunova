package Exercise02;

public class Dog {

	private String name;
	private String breed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public Dog() {
		super();
	}

}
