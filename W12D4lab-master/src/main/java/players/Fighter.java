package players;

import actions.IWeapon;
import enemies.Enemy;
import weapons.Axe;
import weapons.Fist;
import weapons.Weapon;

import javax.jws.WebParam;
import java.util.ArrayList;

public abstract class Fighter extends Player {

    //instance vars:
    private ArrayList<Weapon> allFightersWeapons;
    protected Weapon heldItem;

    // constructor
    public Fighter(String name, int healthPoints, Weapon heldItem) {
        super(name, healthPoints);
        this.allFightersWeapons = new ArrayList<Weapon>();
        this.heldItem = null;
    }


    //methods
    public void addWeaponToFighter(Weapon weapon) {
        allFightersWeapons.add(weapon);
    }

    public void switchWeapon(Weapon weapon) {
        this.heldItem = (weapon);
    }


    public Weapon getHeldItem() {
        return this.heldItem;
    }

public void canAttack(Weapon weapon, Enemy enemy){
        if( this.heldItem == weapon){
            weapon.attack(enemy);
        }
}

    //finish









}
