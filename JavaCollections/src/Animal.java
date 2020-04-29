import java.util.*;

public class Animal extends Address implements Comparable<Animal>{
	private int type;
	private String foodRequired;
	private float weight;
	
	private String state; // 2 chars only!!
	private String street;
	private int zip;
	private String town;
	
	
	
	public Animal(int type, String foodRequired, float weight, String state, String street, int zip, String town) {
		super(state, street, zip, town);
		this.type = type;
		this.foodRequired = foodRequired;
		this.weight = weight;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getFoodRequired() {
		return foodRequired;
	}
	public void setFoodRequired(String foodRequired) {
		this.foodRequired = foodRequired;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (foodRequired == null) {
			if (other.foodRequired != null)
				return false;
		} else if (!foodRequired.equals(other.foodRequired))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		if (type != other.type)
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		if (zip != other.zip)
			return false;
		return true;
	}
	
	public int compareTo(Animal x) {
		if(this.getWeight() > x.getWeight()) {
			return 1;
		}
		else if (this.getWeight() < x.getWeight()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", foodRequired=" + foodRequired + ", weight=" + weight + "]";
	}
	
	
		
	
	
}
