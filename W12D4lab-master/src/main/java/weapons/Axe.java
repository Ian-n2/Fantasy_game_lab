package weapons;

import actions.IWeapon;
import enemies.Enemy;

public class Axe extends Weapon implements IWeapon {

    public Axe(int damageValue){
        super(damageValue);
    }

    //methods
    public void attack(Enemy enemy)
    { int hp = enemy.getHealthPoints();
        int result = hp - damageValue;
        enemy.setHealthPoints(result);
    }


}
