import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle>
{
	@Override
	public int compare(Vehicle vehicle1, Vehicle vehicle2)
	{
		if (vehicle1.getWeight() > vehicle2.getWeight())
		{
			return 1;
		} else if (vehicle1.getWeight() == vehicle2.getWeight())
		{
			return 0;
		} else
		{
			return -1;
		}
	}
}
