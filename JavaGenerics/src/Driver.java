import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Block testBlock = new Block("copper", new Location(0, 0, 0), 5);
		System.out.println(testBlock);
		
		// Character textCharacter = new Character
		// good, just checking, but since Character is abstract, can't create an instance
		
		Villain testVillain = new Villain("Creeper", new Location(0, 1, 0), false, "axe", 6);
		System.out.println(testVillain);

		
		Hero testHero = new Hero("Bowen", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 5, 0) ;
		System.out.println(testHero);

		
		ArrayList<Character> BattleRoyale = new ArrayList<Character>();
		//BattleRoyale.add(testBlock); won't work!! (Thankfully)
		BattleRoyale.add(testVillain);
		BattleRoyale.add(testHero);
		System.out.println("Printing the mother of all battles");
		System.out.println(BattleRoyale);
		System.out.println();
		
		
		// Question 2
		ArrayList<Character> characterList = new ArrayList<Character>();
		Hero testHero1 = new Hero("Bill", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 10, 10) ;
		Hero testHero2 = new Hero("Bob", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 5, 100) ;
		Hero testHero3 = new Hero("Joe", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 12, 20) ;

		characterList.add(testHero);
		characterList.add(testHero1);
		characterList.add(testHero2);
		characterList.add(testHero3);
		
		System.out.println(GameMechanics.BattleTester(characterList));
		
		Villain testVillain1 = new Villain("Creeper1", new Location(0, 1, 0), false, "axe", 2);
		Villain testVillain2 = new Villain("Creeper2", new Location(0, 1, 0), false, "axe", 10);
		Villain testVillain3 = new Villain("Creeper3", new Location(0, 1, 0), false, "axe", 3);
		
		characterList.add(testVillain);
		characterList.add(testVillain1);
		characterList.add(testVillain2);
		characterList.add(testVillain3);
		
		System.out.println(GameMechanics.BattleTester(characterList));
		System.out.println();
	
//		characterList.add(testBlock);
		
		
		// Question 3
		GameMechanics.basicWinChances(testHero1, testVillain1);
		GameMechanics.basicWinChances(testHero2, testVillain2);
		GameMechanics.basicWinChances(testHero3, testVillain3);
		System.out.println();
		
		
		// Question 4
		GameMechanics.advancedWinChances(testHero1, testVillain1);
		GameMechanics.advancedWinChances(testHero2, testVillain2);
		GameMechanics.advancedWinChances(testHero3, testVillain3);
		System.out.println();
		
		
		// Question 5
		System.out.println("Before Sort");
		for (Character character : characterList) {
			System.out.println(character);
		}	
		System.out.println();
		
		GameMechanics.sortedBattlefieldCharacters(characterList);
		
		System.out.println("After Sort");
		for (Character character : characterList) {
			System.out.println(character);
		}		
	}

}
