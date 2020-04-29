import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal>
{
	@Override
	public int compare(Animal animal1, Animal animal2)
	{
		if (animal1.getWeight() > animal2.getWeight())
		{
			return 1;
		} else if (animal1.getWeight() == animal2.getWeight())
		{
			return 0;
		} else
		{
			return -1;
		}
	}

}
