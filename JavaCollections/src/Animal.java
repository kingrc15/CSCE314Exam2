public class Animal extends Address implements Comparable<Animal>
{
	private int type;
	private String foodRequired;
	private float weight;

	public Animal(int type, String foodRequired, float weight, String state, String street, int zip, String town)
	{
		super(state, street, zip, town);
		this.type = type;
		this.foodRequired = foodRequired;
		this.weight = weight;
	}

	public int getType()
	{
		return type;
	}

	public String getFoodRequired()
	{
		return foodRequired;
	}

	public float getWeight()
	{
		return weight;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public void setFoodRequired(String foodRequired)
	{
		this.foodRequired = foodRequired;
	}

	public void setWeight(float weight)
	{
		this.weight = weight;
	}

	public int compareTo(Animal x)
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
		return super.toString() + "\nAnimal [type=" + type + ", foodRequired=" + foodRequired + ", weight=" + weight
				+ "]";
	}

}
