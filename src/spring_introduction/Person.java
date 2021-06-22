package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//	@Autowired
//	@Qualifier("dog")
	private Pet pet;
//	@Value("${person.surname}")
	private String surname;
//	@Value("${person.age}")
	private int age;

	public Person() {
		System.out.println("Person bean is created.");
	}

//	@Autowired
//	public Person(@Qualifier("dog") Pet pet) {
//		System.out.println("Person bean is created.");
//		this.pet = pet;
//	}

//	@Autowired
//	@Qualifier("catBean")
	public void setPet(Pet pet) { //setPet -> pet(id) in xml
		System.out.println("Class Person: set pet.");
		this.pet = pet;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		System.out.println("Class Person: set surname.");
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Class Person: set age.");
		this.age = age;
	}

	public void callYourPet() {
		System.out.println("Hello, my lovely Pet!");
		pet.say();
	}
}
