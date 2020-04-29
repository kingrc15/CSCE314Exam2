import java.util.*;

public class Driver
{

	public static void main(String[] args)
	{
		// Question 1
		Vehicle car4 = new Vehicle(0, 20, "LICENSE4", 4, "TX", "123 Street Ln", 77840, "College Station");
		Vehicle car3 = new Vehicle(0, 20, "LICENSE3", 3, "VA", "123 Street Ln", 77840, "College Station");
		Vehicle car2 = new Vehicle(0, 20, "LICENSE2", 2, "CA", "123 Street Ln", 77840, "College Station");
		Vehicle car1 = new Vehicle(0, 20, "LICENSE1", 1, "MD", "123 Street Ln", 77840, "College Station");

		Animal dog4 = new Animal(0, "Dog Food", 4, "AK", "123 Street Ln", 77840, "College Station");
		Animal dog3 = new Animal(0, "Dog Food", 3, "AR", "123 Street Ln", 77840, "College Station");
		Animal dog2 = new Animal(0, "Dog Food", 2, "FL", "123 Street Ln", 77840, "College Station");
		Animal dog1 = new Animal(0, "Dog Food", 1, "NC", "123 Street Ln", 77840, "College Station");

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

		
		// Question 2 using a comarable and comparator
		AnimalComparator compareAnimals = new AnimalComparator();
		VehicleComparator compareVehicles = new VehicleComparator();

		System.out.println("Animal Sort");
		System.out.println(animalList);
//		Collections.sort(animalList); // Comparable method
		Collections.sort(animalList, compareAnimals); // Comparator method
		System.out.println(animalList);

		System.out.println("\nVehicle Sort");
		System.out.println(vehicleList);
//		Collections.sort(vehicleList); // Comparable method
		Collections.sort(vehicleList, compareVehicles);// Comparator method
		System.out.println(vehicleList);

		
		// Question 3
		System.out.println("\n");
		ArrayList<Address> stuff = new ArrayList<Address>();
		stuff.add(car4);
		stuff.add(car3);
		stuff.add(car2);
		stuff.add(car1);

		stuff.add(dog4);
		stuff.add(dog3);
		stuff.add(dog2);
		stuff.add(dog1);

		for (int i = 0; i < stuff.size(); i++)
		{
			System.out.println(stuff.get(i));
		}
		
		
		// Question 4 using a comparator
		AddressComparator compareAddresses = new AddressComparator();

		Collections.sort(stuff, compareAddresses);
		
		System.out.println("\n");
		for (int i = 0; i < stuff.size(); i++)
		{
			System.out.println(stuff.get(i));
		}
	}

}
