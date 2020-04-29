import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car4 = new Vehicle(0, 20, "LICENSE4", 4f, "Texas", "123 Street Ln", 77840, "College Station");
		Vehicle car3 = new Vehicle(0, 20, "LICENSE3", 3f, "Texas", "123 Street Ln", 77840, "College Station");
		Vehicle car2 = new Vehicle(0, 20, "LICENSE2", 2f,"Texas", "123 Street Ln", 77840, "College Station");
		Vehicle car1 = new Vehicle(0, 20, "LICENSE1", 1f, "Texas", "123 Street Ln", 77840, "College Station");
		
		Animal dog4 = new Animal(0, "Dog Food", 4f, "Texas", "123 Street Ln", 77840, "College Station");
		Animal dog3 = new Animal(0, "Dog Food", 3f, "Texas", "123 Street Ln", 77840, "College Station");
		Animal dog2 = new Animal(0, "Dog Food", 2f, "Texas", "123 Street Ln", 77840, "College Station");
		Animal dog1 = new Animal(0, "Dog Food", 1f, "Texas", "123 Street Ln", 77840, "College Station");
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		vehicleList.add(car4);
		vehicleList.add(car3);
		vehicleList.add(car2);
		vehicleList.add(car1);
		
		animalList.add(dog4);
		animalList.add(dog3);
		animalList.add(dog2);
		animalList.add(dog1);
	
		System.out.println(animalList);
		Collections.sort(animalList);
		System.out.println(animalList);
		
		System.out.println("\n");
		
		System.out.println(vehicleList);
		Collections.sort(vehicleList);
		System.out.println(vehicleList);
		
		
		System.out.println("\n");
		ArrayList<Object> stuff = new ArrayList<Object>();
		stuff.add(car4);
		stuff.add(car3);
		stuff.add(car2);
		stuff.add(car1);
		
		stuff.add(dog4);
		stuff.add(dog3);
		stuff.add(dog2);
		stuff.add(dog1);
		
		for(int i=0; i<stuff.size(); i++) {
			System.out.println(stuff.get(i));
		}
		
		
		
	}

}
