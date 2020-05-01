# Question 1

Setup

Create the directory “GenericExercises”. Within the newly created directory, download the files found at: 

http://faculty.cse.tamu.edu/slupoli/notes/Java/flippedLabs/Generics/code

![UML1](/JavaGenerics/imgs/Generics1.png)

1. Create a VERY basic UML of how the coded files relate, similar to the above UML diagram (Draw your most base class at the very top, then trickle down, shown above).

<center> <img src="/JavaGenerics/imgs/Minecraft UML.png"> </center>

2. Which has more “hearts”, Creeper or Bowen?
    * Creeper
3. How many items can a Villain carry?
    * 1
4. There is one example of Polymorphism in the code. Find it and write it.
    * BattleRoyale is an ArrayList of Characters. Heros and Villains are added to it.
5. Edit the code that when an instance is printed, the name is first (or farthest left).
6. Which Character can have armour?
    * Heros

Submit a zip file containing the answers to the questions above. Also include the actual code (.java file) with the modifications.

# Question 2

1. Create a new public class called GameMechanics with no main().
2. Create a static function **BattleTester** that:
    1. Has one Arraylist parameters, Each Arraylist must contain either all Heros, Villians, or Characters.
    2. Returns true if the Arraylist contains all heros, 
    3. Returns false otherwise
    4. Must use wildcards.(Extends-Any Subtype of Variable(Upper Bound)) (Super-Any SuperType of Variable(Lower Bound)) 
    5. Can use instanceof to help you.
3. Prove that your function works by:
    1. adding several correct Villains and Heroes Arraylists, Arraylist , Arraylist<Villian> for example.
    2. **trying** to add an Arraylist of Blocks (but better be stopped by the compiler or runtime)
  
Submit a zip file with the new code and any other modifications made.

# Question 3

“Hearts” are basically energy level points. The higher the better. Currently, if Bowen (Hero at 5 hearts) were to fight the Creeper (Villain at 6 hearts), the Creeper would have a good chance to win. 

Using the GameMechanics class, create a new static function **basicWinChances** that would look at ONLY Villains and Heros (or Heros and Villians) parameters, compare hearts, and print the ratio, and WHO should win. Your code should also display a simple error statement if BOTH parameters are the same. (Creepers don’t fight Creepers) Test not only your code works, but again, protects from Blocks being compared. **The output need to be easy to read!!!**

Examples:

![BattleTest Output](/JavaGenerics/imgs/Generics2.png)

Make sure to:

1. Create several examples of Winners correctly.
2. output is easy to read (winner and ratio).
3. function basicWinChances is created, works, and restricts Blocks.

# Question 4

Armour (or armor apparently) can only be used by a Hero. This evens the playing field. While not defined well with the code, the value a Hero can have for armour is 0 to 100 (0 to 100%). At 100%, the current “hearts” is multiplied by 1.5. So if Bowen has 10 hearts and 100% armour, he would be fighting with 15 hearts. There are also other Characters (such as Villagers), so the explicit use of Villains and Heros as your parameters is of no use anymore. (If you did it that way). Using the basicWinChances function, create a new function **advancedWinChances** that would now take the armour into consideration.

Examples:

![BattleTest Output](/JavaGenerics/imgs/Generics3.png)

Make sure to:

1. Create several examples of Winners correctly.

2. Function basicWinChances is created, works, and is open to other Characters if needed.

# Question 5

An entire ArrayList full of Characters will be collected. That collection of Characters will be sorted from strongest to weakest. use a static function within GameMechanics function called **sortedBattlefieldCharacters**, it must consider the armour as well, the rest is up to you to implement.

Make sure to:

1. Create several examples of Characters of each type.

2. Add all Characters to the ArrayList BattleRoyale.

3. Print the list BEFORE entering the function sortedBattlefieldCharacters.

4. Using the sortedBattlefieldCharacters function, sorts correctly.

5. Print the list AFTER entering the function sortedBattlefieldCharacters

(Strongest Characters should be up front)
