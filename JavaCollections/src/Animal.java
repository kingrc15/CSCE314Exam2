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
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((foodRequired == null) ? 0 : foodRequired.hashCode());
		result = prime * result + type;
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (foodRequired == null)
		{
			if (other.foodRequired != null)
				return false;
		} else if (!foodRequired.equals(other.foodRequired))
			return false;
		if (type != other.type)
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nAnimal [type=" + type + ", foodRequired=" + foodRequired + ", weight=" + weight
				+ "]";
	}

}
