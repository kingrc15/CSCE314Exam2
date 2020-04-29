import java.util.ArrayList;
import java.util.List;

public class Hero extends Character
{
	private int armour; // [0 - 100%]

	public Hero(String name, Location location, List<String> carrying, int hearts, int armour)
	{
		// taking care of items needed for Item
		super(name, location);
		// taking care of abstract items from Character
		super.carrying = new ArrayList<String>();
		super.carrying = carrying; // passed in from constuctor
		super.hearts = hearts;
		this.armour = armour;
	}

	public int getArmour()
	{
		return armour;
	}

	public void setArmour(int armour)
	{
		this.armour = armour;
	}

	public String getCarrying()
	{
		return super.carrying.toString();
	}

	public void setCarrying(String thing)
	{
		super.carrying = thing;
	};

	@Override
	public String toString()
	{
		return "Hero [name=" + name + ", armour=" + armour + ", hearts=" + hearts + ", carrying=" + getCarrying()
				+ ", location=" + location + "]";
	}

	@Override
	public int compareTo(Character other)
	{
		double obj1Strength = hearts + hearts * (1.5 * armour / 100);
		double obj2Strength = other.getHearts();

		if (other instanceof Hero)
		{
			obj2Strength += obj2Strength * (1.5 * ((Hero) other).getArmour() / 100);
		}

		if (obj1Strength > obj2Strength)
		{
			return 1;
		} else if (obj1Strength == obj2Strength)
		{
			return 0;
		} else
		{
			return -1;
		}
	}

}
