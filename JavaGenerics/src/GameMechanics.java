import java.util.ArrayList;
import java.util.Collections;

public class GameMechanics
{
	static public boolean BattleTester(ArrayList<? super Character> list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			if (!(list.get(i) instanceof Hero))
			{
				return false;
			}
		}

		return true;
	}


	static public void advancedWinChances(Character Object1, Character Object2)
	{
		
		if ((Object1 instanceof Villain) && (Object2 instanceof Villain))
		{
			System.out.println("Two Villains can't battle, ");
			return;
		}

		if ((Object1 instanceof Hero) && (Object2 instanceof Hero))
		{
			System.out.println("Two Hero can't battle, ");
			return;
		}
		
		float obj1Hearts = Object1.getHearts();
		float obj2Hearts = Object2.getHearts();

		System.out.print("Object 1: " + Object1.getName() + ", " + obj1Hearts + " hearts");
		
		if (Object1 instanceof Hero) {
			System.out.print(", armour: " + ((Hero) Object1).getArmour() + "% ");
			obj1Hearts += obj1Hearts * (1.5 * ((Hero) Object1).getArmour() / 100);
		}
		
		System.out.print("Object 2: " + Object2.getName() + ", " + obj2Hearts + " hearts");
		
		if (Object2 instanceof Hero) {
			System.out.print(", armour: " + ((Hero) Object2).getArmour() + "% ");
			obj2Hearts += obj2Hearts * (1.5 * ((Hero) Object2).getArmour() / 100);
		}

		if (obj1Hearts > obj2Hearts)
		{
			System.out.print(" Ratio: " + obj1Hearts / obj2Hearts + " to 1");
			System.out.println(" Winner: " + Object1.getName());
		} else
		{
			System.out.print(" Ratio: 1 to " + obj2Hearts / obj1Hearts);
			System.out.println(" Winner: " + Object2.getName());
		}
	}

	
	static public void basicWinChances(Character Object1, Character Object2)
	{
		if ((Object1 instanceof Villain) && (Object2 instanceof Villain))
		{
			System.out.println("Two Villains can't battle, ");
			return;
		}

		if ((Object1 instanceof Hero) && (Object2 instanceof Hero))
		{
			System.out.println("Two Hero can't battle, ");
			return;
		}

		System.out.print("Object 1: " + Object1.getName() + ", " + Object1.getHearts() + " hearts ");
		System.out.print("Object 2: " + Object2.getName() + ", " + Object2.getHearts() + " hearts ");

		if (Object1.getHearts() > Object2.getHearts())
		{
			System.out.print(" Ratio: " + Object1.getHearts() / Object2.getHearts() + " to 1");
			System.out.println(" Winner: " + Object1.getName());
		} else
		{
			System.out.print(" Ratio: 1 to " + Object2.getHearts() / Object1.getHearts());
			System.out.println(" Winner: " + Object2.getName());
		}
	}

	
	static public void sortedBattlefieldCharacters(ArrayList<Character> List)
	{
		Collections.sort(List);
		Collections.reverse(List);
	}
}
