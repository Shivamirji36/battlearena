import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        String name = input.nextLine();
        String winner = "";

        if (name.equalsIgnoreCase("warrior")) {
            Warrior hero = new Warrior("Warrior");
            Enemy enemy = new Enemy("Goblin");

            hero.showStats();
            enemy.showStats();

            while (hero.isAlive() && enemy.isAlive()) {
                int damage = hero.attack();
                enemy.takeDamage(damage);

                System.out.println("Warrior deals " + hero.attack() + " damage to Enemy");
                System.out.println("Enemy Health: " + enemy.health);

                damage = enemy.attack();
                hero.takeDamage(damage);

                System.out.println("Enemy deals " + enemy.attack() + " damage to Hero");
                System.out.println("Hero Health: " + hero.health);

                if (hero.health <= 0 && enemy.health <= 0) {
                    winner = "Double KO";
                    break;
                }
                else if (hero.health <= 0) {
                    winner = "Enemy";
                    break;
                } else if (enemy.health <= 0) {
                    winner = "Hero";
                    break;
                }

            }
            if (winner.equals("Enemy")) {
                System.out.println("Enemy Wins!!");
            }
            else if (winner.equals("Hero")) {
                System.out.println("Warrior Win!!");
            }
            else {
                System.out.println("Double KO");
            }
            
        }
        else if (name.equalsIgnoreCase("mage")) {
            Mage hero = new Mage("Mage");
            Enemy enemy = new Enemy("Goblin");

            hero.showStats();
            enemy.showStats();

            while (hero.isAlive() && enemy.isAlive()) {
                int damage = hero.attack();
                enemy.takeDamage(damage);

                System.out.println("Mage deals " + hero.attack() + " damage to Enemy");
                System.out.println("Enemy Health: " + enemy.health);

                damage = enemy.attack();
                hero.takeDamage(damage);

                System.out.println("Enemy deals " + enemy.attack() + " damage to Hero");
                System.out.println("Hero Health: " + hero.health);

                if (hero.health <= 0 && enemy.health <= 0) {
                    winner = "Double KO";
                    break;
                } else if (enemy.health <= 0) {
                    winner = "Hero";
                    break;
                } else if (hero.health <= 0) {
                    winner = "Enemy";
                    break;
                }
            }
            if (winner.equals("Hero")) {
                System.out.println("Mage Win!!");
            }
            else if (winner.equals("Enemy")) {
                System.out.println("Enemy Win!!");
            }
            else {
                System.out.println("Double KO");
            }

        }
        else if (name.equalsIgnoreCase("archer")) {
            Archer hero = new Archer("Archer");
            Enemy enemy = new Enemy("Goblin");

            hero.showStats();
            enemy.showStats();

            while (hero.isAlive() && enemy.isAlive()) {
                int damage = hero.attack();
                enemy.takeDamage(damage);

                System.out.println("Archer deals " + hero.attack() + " damage to Enemy");
                System.out.println("Enemy Health: " + enemy.health);

                damage = enemy.attack();
                hero.takeDamage(damage);

                System.out.println("Enemy deals " + enemy.attack() + " damage to Hero");
                System.out.println("Hero Health: " + hero.health);

                if (hero.health <= 0 && enemy.health <= 0) {
                    winner = "Double KO";
                    break;
                } else if (enemy.health <= 0) {
                    winner = "Hero";
                    break;
                } else if (hero.health <= 0) {
                    winner = "Enemy";
                    break;
                }
            }
            if (winner.equals("Hero")) {
                System.out.println("Archer Win!!");
            } else if (winner.equals("Enemy")) {
                System.out.println("Enemy Win!!");
            } else {
                System.out.println("Double KO");
            }

        }
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

    //This method takes the damage from enemy or hero
    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
    }

    //This method checks whether the Hero or Enemy is alive
    public boolean isAlive(){
        if(health > 0){
            return true;
        }
        else{
            return false;
        }
    }

    //This method shows the Stats of Enemy or Hero
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
    
    public String getType() {
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

    public String getType() {
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

    public String getType() {
        return "Archer";
    }
}

class Enemy extends Character {
    Enemy(String name) {
        super(name, 100, 10);
    }

    public int attack() {
        return attackPower;
    }

    public String getType() {
        return "Enemy";
    }
}