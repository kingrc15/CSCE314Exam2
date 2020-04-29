//import java.util.Comparator;

public class Vehicle extends Address implements Comparable<Vehicle>
{
	private int type, age;
	private String licensePlate;
	private float weight;

	public Vehicle(int type, int age, String licensePlate, float weight, String state, String street, int zip,
			String town)
	{
		super(state, street, zip, town);
		this.type = type;
		this.age = age;
		this.licensePlate = licensePlate;
		this.weight = weight;
	}

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getLicensePlate()
	{
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate)
	{
		this.licensePlate = licensePlate;
	}

	public float getWeight()
	{
		return weight;
	}

	public void setWeight(float weight)
	{
		this.weight = weight;
	}

	public int compareTo(Vehicle x)
	{
		if (this.getWeight() > x.getWeight())
		{
			return 1;
		} else if (this.getWeight() < x.getWeight())
		{
			return -1;
		}
		return 0;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nVehicle [type=" + type + ", age=" + age + ", licensePlate=" + licensePlate
				+ ", weight=" + weight + "]";
	}

}
