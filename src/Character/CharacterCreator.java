package Character;

import java.util.Random;
import java.util.Scanner;

public class CharacterCreator {
	public Character createCharacter(String role){
		Character character = new Character();
		System.out.println("Please Input a Role");
		
		Scanner scn = new Scanner(System.in);
		do
        {
            //sets initial stats
			switch (role.toLowerCase())
            {
                case "funeral director":
                    Random rnd = new Random();
                    character.setHealth(rnd.nextInt(81)+50);
                    character.setAttack(rnd.nextInt(46)+5);
                    character.setDefense(rnd.nextInt(25));
                    character.setMagicAttack(rnd.nextInt(35));
                    character.setMagicDefense(rnd.nextInt(25));
                    character.setLuck(rnd.nextInt(17)+4);
                    character.setSpeed(rnd.nextInt(26)+1);
                    character.setRoleName("Funeral Director");
                    //ask cameron about getInventory()
                    character.getInventory().add("Trocar");
                    character.getInventory().add("Trench Coat");
                    character.getInventory().add("Bowler Hat");



                    break;

                case "knight":
                    character.setHealth(100);
                    character.setAttack(30);
                    character.setDefense(20);
                    character.setMagicAttack(0);
                    character.setMagicDefense(15);
                    character.setLuck(4);
                    character.setSpeed(5);
                    character.setRoleName("Knight");
                    character.getInventory().add("Basic Longsword");
                    character.getInventory().add("Knight's Armor");
                    character.getInventory().add("Knight's Helmet");
                    character.getInventory().add("Knight's Leggings");
                    character.getInventory().add("Knight's Gauntlets");


                    break;
                case "warrior":
                    character.setHealth(120);
                    character.setAttack(30);
                    character.setDefense(10);
                    character.setMagicAttack(0);
                    character.setMagicDefense(10);
                    character.setLuck(4);
                    character.setSpeed(5);
                    character.setRoleName("Warrior");
                    character.getInventory().add("Broadsword");
                    character.getInventory().add("Brass Chestplate");
                    character.getInventory().add("Tattered Pants");
                    break;

                case "thief":
                    character.setHealth(70);
                    character.setAttack(40);
                    character.setDefense(5);
                    character.setMagicAttack(5);
                    character.setMagicDefense(5);
                    character.setLuck(8);
                    character.setSpeed(15);
                    character.setRoleName("Thief");
                    character.getInventory().add("Curved Dagger");
                    character.getInventory().add("Hood");
                    character.getInventory().add("Black Cloak");
                    character.getInventory().add("Light Gloves");


                    break;

                case "mage":
                    character.setHealth(80);
                    character.setAttack(5);
                    character.setDefense(5);
                    character.setMagicAttack(25);
                    character.setMagicDefense(20);
                    character.setLuck(4);
                    character.setSpeed(10);
                    character.setRoleName("Mage");
                    character.getInventory().add("Staff");
                    character.getInventory().add("Mage Cloak");
                    character.getInventory().add("Dull Dagger");
                    character.getSpellBook().add("Magic Spear");



                    break;

                case "cleric":
                    character.setHealth(110);
                    character.setAttack(20);
                    character.setDefense(10);
                    character.setMagicAttack(20);
                    character.setMagicDefense(25);
                    character.setLuck(8);
                    character.setSpeed(5);
                    character.setRoleName("Cleric");
                    character.getInventory().add("Mace");
                    character.getInventory().add("Long Robe");
                    character.getInventory().add("Talisman");
                    character.getSpellBook().add("Heal");


                    break;

                case "jester":
                    character.setHealth(70);
                    character.setAttack(10);
                    character.setDefense(5);
                    character.setMagicAttack(10);
                    character.setMagicDefense(10);
                    character.setLuck(16);
                    character.setSpeed(20);
                    character.setRoleName("Jester");
                    character.getInventory().add("Jester Cap");
                    character.getInventory().add("Brass Knuckles");
                    character.getInventory().add("Jester Outfit");
                    character.getInventory().add("Jester Shoes");
                    character.getInventory().add("Jester Gloves");



                    break;

                default:
                    System.out.println("Please input a valid class name");
                    role = scn.nextLine();
					
                    break;
            }
        } while (character.getHealth() == 0);

        return character;
	}
}
