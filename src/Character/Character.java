package Character;

import java.util.ArrayList;
import java.util.Random;

public class Character
{
  	private String playerName;
    private String roleName;
    private int level;
    private int nextLevel;
    private int exp;
    private int levelUpExp;
    private int health;
    private int attack;
    //Need to have direct modifier for critical hits so items can be affected by luck and it wont be broken
    private int critMod;
    private int defense;
    private int magicAttack;
    private int magicDefense;
    private int luck;
    private int speed;        
    private boolean isBurned;
    private boolean isConfused;
    private boolean isAsleep;
    private boolean isParalyzed;
    // need to change to item once items are implemented
    private ArrayList<String> inventory;
    // need to change to spell once spells are implemented
    private ArrayList<String> spellBook;
    public Character(){
    	
    }
    public Character(String playerName, String roleName, int level, int health, int attack, int defense,
			int magicAttack, int magicDefense, int luck, int speed) {
    	inventory = new ArrayList<String>();
    	spellBook = new ArrayList<String>();
		this.playerName = playerName;
		this.roleName = roleName;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.magicAttack = magicAttack;
		this.magicDefense = magicDefense;
		this.luck = luck;
		this.speed = speed;		
		}	
   //Getters and Setters


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getNextLevel() {
		return nextLevel;
	}


	public void setNextLevel(int nextLevel) {
		this.nextLevel = nextLevel;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public int getLevelUpExp() {
		return levelUpExp;
	}


	public void setLevelUpExp(int levelUpExp) {
		this.levelUpExp = levelUpExp;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getCritMod() {
		return critMod;
	}


	public void setCritMod(int critMod) {
		this.critMod = critMod;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getMagicAttack() {
		return magicAttack;
	}


	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}


	public int getMagicDefense() {
		return magicDefense;
	}


	public void setMagicDefense(int magicDefense) {
		this.magicDefense = magicDefense;
	}


	public int getLuck() {
		return luck;
	}


	public void setLuck(int luck) {
		this.luck = luck;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public boolean isBurned() {
		return isBurned;
	}


	public void setBurned(boolean isBurned) {
		this.isBurned = isBurned;
	}


	public boolean isConfused() {
		return isConfused;
	}


	public void setConfused(boolean isConfused) {
		this.isConfused = isConfused;
	}


	public boolean isAsleep() {
		return isAsleep;
	}


	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}


	public boolean isParalyzed() {
		return isParalyzed;
	}


	public void setParalyzed(boolean isParalyzed) {
		this.isParalyzed = isParalyzed;
	}


	public ArrayList<String> getInventory() {
		return inventory;
	}


	public void setInventory(ArrayList<String> inventory) {
		this.inventory = inventory;
	}


	public ArrayList<String> getSpellBook() {
		return spellBook;
	}


	public void setSpellBook(ArrayList<String> spellBook) {
		this.spellBook = spellBook;
	}
    
	}