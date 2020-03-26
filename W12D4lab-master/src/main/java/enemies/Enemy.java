package enemies;

import actions.IWeapon;
import players.Player;

public abstract class Enemy {

    //instance variables
    private int healthPoints;
    private int attackDamage;

    //constructor
    public Enemy(int healthPoints, int attackDamage){
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;

    }

    //methods
    public void attackPlayer(Player player, Enemy enemy){
        player.healthPoints -= enemy.getAttackDamage();
    }

    //setters and getters

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
