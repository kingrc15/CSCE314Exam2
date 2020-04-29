import java.util.Comparator;

public class AddressComparator implements Comparator<Address>

{
	@Override
	public int compare(Address address1, Address address2)
	{
		return address1.getState().compareTo(address2.getState());
	}

}
