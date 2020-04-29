
public abstract class Character extends Item implements Comparable<Character>
{
	protected int hearts;
	protected Object carrying;

	public Character(String name, Location location)
	{
		super(name, location);
	}

	public int getHearts()
	{
		return hearts;
	}

	public void setHearts(int hearts)
	{
		this.hearts = hearts;
	}

}
