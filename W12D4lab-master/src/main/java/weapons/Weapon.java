package weapons;

import actions.IWeapon;
import enemies.Enemy;
import players.Player;

public abstract class Weapon implements IWeapon {

    //instance vars
    protected int damageValue;

    //constructor
    public Weapon(int damageValue){
        this.damageValue = damageValue;
    }

    //method



    //getters


    public int getDamageValue() {
        return this.damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
