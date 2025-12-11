public class Main {

  public static void main(String[] args) {}
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
