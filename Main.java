public class Main {

    public static void main(String[] args) {
    
        /*
        Warrior myObj = new Warrior("Warrior");
        myObj.showStats();
        System.out.println(myObj.attack());
        myObj.takeDamage(50);
        myObj.showStats();
        System.out.println(myObj.isAlive());
        */
  }
}

abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    Character(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    abstract int attack();

    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive(){
        if(health > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void showStats(){
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack power: " + attackPower);
    }
}

class Warrior extends Character {
    Warrior(String name) {
        super(name, 120, 15);
    }

    int attack() {
        return attackPower;
    }
    
    public String getType(String name) {
        return "Warrior";
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name, 90, 20);
    }

    int attack() {
        return attackPower;
    }

    public String getType(String name) {
        return "Mage";
    }
}

class Archer extends Character {
    Archer(String name) {
        super(name, 100, 12);
    }

    int attack() {
        return attackPower;
    }

    public String getType(String name) {
        return "Archer";
    }
}