package _OCA_Book_Example;

public class Zookeeper {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		System.out.println(animal.getName());
		
		System.out.println(animal.legs);
		
		Gorilla gorilla = new Gorilla();
		
		System.out.println(gorilla.legs);
		
		Animal animal2 = new Gorilla();
		
	    System.out.println(animal2.legs);

	}

}
