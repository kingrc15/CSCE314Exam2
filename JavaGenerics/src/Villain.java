
public class Villain extends Character
{
	private boolean nocturnal;

	

	public Villain(String name, Location location, boolean nocturnal, String carrying, int hearts) 
	{
		// taking care of items needed for Item
		super(name, location);
		// taking care of abstract items from Character
		super.carrying = new String();
		super.carrying = carrying; // passed in from constuctor
		super.hearts = hearts;	
		this.nocturnal = nocturnal;
	}
	
	public boolean isNocturnal() { return nocturnal; }
	public void setNocturnal(boolean nocturnal) { this.nocturnal = nocturnal; } 
	public String getCarrying() { return (String) super.carrying; }
	public void setCarrying(String thing) { super.carrying = thing; };
	

	@Override
	public String toString() {
		return "Villain [nocturnal=" + nocturnal + ", hearts=" + hearts + ", carrying=" + getCarrying() + ", name=" + name
				+ ", location=" + location + "]";
	}	
	
	@Override
	public int compareTo(Character other)
	{
		double obj1Strength = hearts;
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
